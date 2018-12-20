package org.jsq;

import org.jsq.core.basic.Pitch;
import org.jsq.core.basic.Control;
import org.jsq.core.music.Temporal;
import org.jsq.core.music.Note;
import org.jsq.core.music.ControlTemporal;
import org.jsq.exception.JsqUnsupportedException;

public class NoteUtils {
    public static Pitch makePitch(String pitchStr) {
        String[] parts = pitchStr.split("[oO]");
        Pitch.Step step;
        int octave = parts.length==1 ? 0 : Integer.parseInt(parts[1]);
        if(parts[0].length()==1) {
            step = Pitch.Step.valueOf(parts[0]);
        } else {
            if('#' != parts[0].charAt(1) && 'b' != parts[0].charAt(1)) throw new JsqUnsupportedException("Temporal suffix can only be #(sharp) or b(flat)");
            step = Pitch.Step.valueOf(parts[0].charAt(0) + (parts[0].charAt(1)=='#'? "SHARP":"FLAT"));
        }
        return Pitch.construct(step, octave);
    }

    public static Temporal makeTemporal(String temporalStr) {
        switch(temporalStr.toUpperCase()) {
            case "T":return new ControlTemporal(Control.construct(Control.Type.TENUTO));
            case "R":return new ControlTemporal(Control.construct(Control.Type.REST));
            default: return new Note(NoteUtils.makePitch(temporalStr));
        }
    }
}
