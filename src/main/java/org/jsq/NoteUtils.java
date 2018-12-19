package org.jsq;

import org.jsq.core.basic.Pitch;
import org.jsq.exception.JsqUnsupportedException;

public class NoteUtils {
    public static Pitch makePitch(String pitchStr) {
        pitchStr = pitchStr.toUpperCase();
        String[] parts = pitchStr.split("O");
        Pitch.Step step;
        int octave = parts.length==1 ? 0 : Integer.parseInt(parts[1]);
        if(parts[0].length()==1) {
            step = Pitch.Step.valueOf(parts[0]);
        } else {
            if('#' != parts[0].charAt(1) && 'B' != parts[0].charAt(1)) throw new JsqUnsupportedException("Note suffix can only be #(sharp) or b(flat)");
            step = Pitch.Step.valueOf(parts[0].charAt(0) + (parts[0].charAt(1)=='#'? "SHARP":"FLAT"));
        }
        return Pitch.construct(step, octave);
    }
}
