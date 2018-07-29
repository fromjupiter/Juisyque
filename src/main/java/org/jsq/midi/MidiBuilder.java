package org.jsq.midi;

import javafx.util.Pair;
import lombok.Getter;
import org.jsq.MusicSheet;
import org.jsq.core.NoteVector;
import org.jsq.core.basic.Pitch;
import org.jsq.core.basic.Symbol;
import org.jsq.core.generic.Vector;
import org.jsq.core.note.ChordNote;
import org.jsq.core.note.Note;
import org.jsq.core.note.PitchNote;
import org.jsq.core.note.SymbolNote;
import org.jsq.exception.JsqInvalidAttributeException;

import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MidiBuilder {

    @Getter
    private List<MusicSheet> scores;

    private Sequence sequence;
    private int nextChannel=0;

    private MidiBuilder() {
        scores = new ArrayList<>();
    }

//    protected MidiBuilder(int tickPerBeat){
//        try{
//            sequence = new Sequence(Sequence.PPQ, tickPerBeat);
//            this.tickPerBeat = tickPerBeat;
//        }catch (InvalidMidiDataException e){
//            e.printStackTrace();
//            System.exit(1);
//        }
//    }

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


    private void initSequence() throws JsqInvalidAttributeException {
        //calculate Pulses Per Quarter note
        int pulsePerQuarter = MidiHelper.getPPQ(this.scores);

        try{
            sequence = new Sequence(Sequence.PPQ, pulsePerQuarter);
        }catch (InvalidMidiDataException e){
            throw new JsqInvalidAttributeException("Midi Sequence initialization failed!", e);
        }
    }

    private void writeSheet(MusicSheet sheet) throws Exception {
        Track track = sequence.createTrack();
        int ppq = sequence.getResolution();

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

        for (Vector<Note> vec : sheet.getScore()) {
            long tickCursor = 0;
            for(Note note : vec ) {
                if(note instanceof PitchNote) {
                    PitchNote pn = (PitchNote) note;
                    track.add(MidiHelper.createNoteEvent(ShortMessage.NOTE_ON,nChannel,pn.getPitch().toMidiKey(), note.getVolume().toMidiVelocity()
                            ,tickCursor));
                    track.add(MidiHelper.createNoteEvent(ShortMessage.NOTE_OFF,nChannel,pn.getPitch().toMidiKey(), note.getVolume().toMidiVelocity()
                            ,tickCursor+MidiHelper.getNoteTick(ppq, sheet.getSpeedMultiplier(), note)));
                } else if (note instanceof ChordNote) {
                    ChordNote cn = (ChordNote) note;
                    for (Pitch pitch : cn.getChord()) {
                        track.add(MidiHelper.createNoteEvent(ShortMessage.NOTE_ON,nChannel,pitch.toMidiKey(), note.getVolume().toMidiVelocity()
                                ,tickCursor));
                        track.add(MidiHelper.createNoteEvent(ShortMessage.NOTE_OFF,nChannel,pitch.toMidiKey(), note.getVolume().toMidiVelocity()
                                ,tickCursor+MidiHelper.getNoteTick(ppq, sheet.getSpeedMultiplier(), note)));
                    }
                } else if (note instanceof SymbolNote) {
                    //TODO: support TENUTO
                }
                tickCursor+=MidiHelper.getNoteTick(ppq, sheet.getSpeedMultiplier(), note);
            }
        }
    }


    public static MidiBuilder newInstance() {
        return new MidiBuilder();
    }
}
