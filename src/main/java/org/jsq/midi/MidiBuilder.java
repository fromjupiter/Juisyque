package org.jsq.midi;

import javafx.util.Pair;
import lombok.Getter;
import org.jsq.MusicSheet;
import org.jsq.core.basic.Pitch;
import org.jsq.core.basic.Control;
import org.jsq.core.generic.Vector;
import org.jsq.core.music.Chord;
import org.jsq.core.music.Temporal;
import org.jsq.core.music.Note;
import org.jsq.core.music.ControlTemporal;
import org.jsq.exception.JsqInvalidLogicException;

import javax.sound.midi.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class MidiBuilder {

    @Getter
    private List<MusicSheet> scores;

    private Sequence sequence;
    private int nextChannel=0;

    private MidiBuilder() {
        scores = new ArrayList<>();
    }

    public MidiBuilder addScore(MusicSheet ms) {
        scores.add(ms);
        return this;
    }

    public boolean tryBuild(String fileName) {
        try{
            initSequence();

            for(MusicSheet score:scores) {
                this.writeSheet(score);
            }

            MidiSystem.write(sequence, 1, new File(fileName));
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


    private void initSequence() throws JsqInvalidLogicException {
        //calculate Pulses Per Quarter music
        int pulsePerQuarter = MidiHelper.getPPQ(this.scores);

        try{
            sequence = new Sequence(Sequence.PPQ, pulsePerQuarter);
        }catch (InvalidMidiDataException e){
            throw new JsqInvalidLogicException("Midi Sequence initialization failed!", e);
        }
    }

    private void writeSheet(MusicSheet sheet) throws Exception {
        Track track = sequence.createTrack();
        int ppq = sequence.getResolution();
        int offset = sheet.getOctaveOffset();

        //set tempo
        int mpq = 60000000/sheet.getTempo();
        final int TEMPO = 0x51;
        byte[] data = new byte[3];
        data[0] = (byte)((mpq >> 16) & 0xFF);
        data[1] = (byte)((mpq >> 8) & 0xFF);
        data[2] = (byte)(mpq & 0xFF);
        track.add(MidiHelper.createMetaEvent(TEMPO, data, 0));

        //choose channel
        int nChannel;
        //channel 10 is reserved for percussion instruments
        do{
            nChannel = nextChannel++;
        }while(nChannel==10);
        if(nChannel>15){
            throw new MidiUnavailableException("No available channels.");
        }

        //choose instrument
        Pair<Integer,Integer> instrumentInfo = MidiHelper.getInstrumentInfo(sheet.getInstrument());

        track.add(MidiHelper.createNoteEvent(ShortMessage.CONTROL_CHANGE,nChannel,0, instrumentInfo.getKey()>>7, 0));
        track.add(MidiHelper.createNoteEvent(ShortMessage.CONTROL_CHANGE,nChannel,32, instrumentInfo.getKey()&0x7f, 0));
        track.add(MidiHelper.createNoteEvent(ShortMessage.PROGRAM_CHANGE,nChannel,instrumentInfo.getValue(), 0, 0));

        for (Vector<Temporal> vec : sheet.getScore()) {
            long tickCursor = 0;
            List<MidiEvent> offEventsCache = new ArrayList<>();
            for(Temporal note : vec ) {
                if (note instanceof ControlTemporal && ((ControlTemporal)note).getValue().getType()== Control.Type.TENUTO) {
                    //update cache
                    for (MidiEvent event : offEventsCache) {
                        event.setTick(event.getTick() + MidiHelper.getNoteTick(ppq, sheet.getSpeedMultiplier(), note));
                    }
                }else {
                    //flush cache
                    offEventsCache.forEach(track::add);
                    offEventsCache.clear();
                }

                if(note instanceof Note) {
                    Note pn = (Note) note;
                    track.add(MidiHelper.createNoteEvent(ShortMessage.NOTE_ON,nChannel,pn.getPitch().toMidiKey(offset), note.getVolume().toMidiVelocity()
                            ,tickCursor));
                    offEventsCache.add(MidiHelper.createNoteEvent(ShortMessage.NOTE_OFF,nChannel,pn.getPitch().toMidiKey(offset), note.getVolume().toMidiVelocity()
                            ,tickCursor+MidiHelper.getNoteTick(ppq, sheet.getSpeedMultiplier(), note)));
                } else if (note instanceof Chord) {
                    Chord chord = (Chord) note;
                    for (Pitch pitch : StreamSupport.stream(chord.spliterator(),false).map(Note::getPitch).collect(Collectors.toList())) {
                        track.add(MidiHelper.createNoteEvent(ShortMessage.NOTE_ON,nChannel,pitch.toMidiKey(offset), note.getVolume().toMidiVelocity()
                                ,tickCursor));
                        offEventsCache.add(MidiHelper.createNoteEvent(ShortMessage.NOTE_OFF,nChannel,pitch.toMidiKey(offset), note.getVolume().toMidiVelocity()
                                ,tickCursor+MidiHelper.getNoteTick(ppq, sheet.getSpeedMultiplier(), note)));
                    }
                }
                tickCursor+=MidiHelper.getNoteTick(ppq, sheet.getSpeedMultiplier(), note);
            }
            //flush cache
            offEventsCache.forEach(track::add);
            offEventsCache.clear();
        }
    }


    public static MidiBuilder newInstance() {
        return new MidiBuilder();
    }
}
