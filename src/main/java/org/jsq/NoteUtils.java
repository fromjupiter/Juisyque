package org.jsq;

import org.jsq.core.basic.Pitch;
import org.jsq.core.basic.Symbol;
import org.jsq.core.note.Note;
import org.jsq.core.note.PitchNote;
import org.jsq.core.note.SymbolNote;
import org.jsq.exception.JsqUnsupportedException;

public class NoteUtils {
    public static Pitch makePitch(String pitchStr) {
        String[] parts = pitchStr.split("[oO]");
        Pitch.Step step;
        int octave = parts.length==1 ? 0 : Integer.parseInt(parts[1]);
        if(parts[0].length()==1) {
            step = Pitch.Step.valueOf(parts[0]);
        } else {
            if('#' != parts[0].charAt(1) && 'b' != parts[0].charAt(1)) throw new JsqUnsupportedException("Note suffix can only be #(sharp) or b(flat)");
            step = Pitch.Step.valueOf(parts[0].charAt(0) + (parts[0].charAt(1)=='#'? "SHARP":"FLAT"));
        }
        return Pitch.construct(step, octave);
    }

    public static Note makeNote(String noteStr) {
        switch(noteStr.toUpperCase()) {
            case "T":return new SymbolNote(Symbol.construct(Symbol.Type.TENUTO));
            case "R":return new SymbolNote(Symbol.construct(Symbol.Type.REST));
            default: return new PitchNote(NoteUtils.makePitch(noteStr));
        }
    }
}
