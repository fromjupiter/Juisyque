package org.jsq.midi;

import javafx.util.Pair;
import org.jsq.MusicSheet;
import org.jsq.core.note.Note;
import org.jsq.exception.JsqInvalidAttributeException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import java.util.List;

public class MidiHelper {

    private static final int MAX_PPQ_LIMIT = 128;

    public static int getPPQ(List<MusicSheet> sheets) throws JsqInvalidAttributeException {
        double gcd = 1.0;
        //get gcd of all notes
        outer:
        for(MusicSheet sheet: sheets) {
            for (int i=0; i < sheet.getScore().size(); ++i) {
                for (int j = 0; j < sheet.getScore().get(i).size(); ++j) {
                    Note note = sheet.getScore().get(i, j);
                    // second argument represents how many quarter notes the note lasts
                    gcd = MidiHelper.GCD(gcd, 4 * note.getTimeSpan() * note.getSpanBase() / sheet.getSpeedMultiplier());
                }
                //validate
                if (gcd * MAX_PPQ_LIMIT < 1) break outer;
            }
        }

        double result = 1.0/gcd;
        //int gcd = scores.get(0).getScore().get(0).

        if(result > 128 || Math.abs(Math.round(result) - result) > 1e-5) {
            throw new JsqInvalidAttributeException("Can't find proper PPQ for the music sheets");
        }

        return (int) Math.round(result);
    }

    public static int getNoteTick(int ppq, double speedMultiplier, Note note) throws JsqInvalidAttributeException {
        long result = Math.round( ppq * 4 * note.getTimeSpan() * note.getSpanBase() /speedMultiplier );
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new JsqInvalidAttributeException(String.format("Calculated tick [%d] of note [%s] is out of boundary",result, note));
        }
        return (int)result;
    }

    public static Pair<Integer, Integer> getInstrumentInfo(String instrument) {
        //TODO: map to correct instrument
        return new Pair<>(0,1);
    }

    public static MidiEvent createNoteEvent(int nCommand, int nChannel, int nKey, int nVelocity, long lTick) {
        ShortMessage message = new ShortMessage();
        try {
            message.setMessage(nCommand, nChannel,nKey, nVelocity);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
            System.exit(1);
        }
        MidiEvent event = new MidiEvent(message, lTick);
        return event;
    }

    public static MidiEvent createMetaEvent(int status,byte[] data,long lTick){
        MetaMessage message = new MetaMessage();
        try {
            message.setMessage(status,data,data.length);

        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
            System.exit(1);
        }
        MidiEvent event = new MidiEvent(message, lTick);
        return event;
    }

    /*
        Greatest Common Divisor for floating numbers
     */
    public static double GCD(double m, double n) {
        if (m < n) {// make sure m>n
            return GCD(n, m);
        }

        // base case
        if (Math.abs(n) < 0.0001) {
            return m;
        } else {
            return (GCD(n, m - Math.floor(m / n) * n));
        }
    }
}
