package org.jsq.core;

import org.jsq.core.basic.Chord;
import org.jsq.core.basic.Pitch;
import org.jsq.core.basic.Symbol;
import org.jsq.core.note.ChordNote;
import org.jsq.core.note.Note;

import java.util.ArrayList;
import java.util.List;

public class TestHelper {
    // basic pitch
    public static final Pitch pDo = Pitch.construct(Pitch.Step.C, 4);
    public static final Pitch pRe = Pitch.construct(Pitch.Step.D, 4);
    public static final Pitch pMi = Pitch.construct(Pitch.Step.E, 4);
    public static final Pitch pFa = Pitch.construct(Pitch.Step.F, 4);
    public static final Pitch pSo = Pitch.construct(Pitch.Step.G, 4);
    public static final Pitch pLa = Pitch.construct(Pitch.Step.A, 4);
    public static final Pitch pSi = Pitch.construct(Pitch.Step.B, 4);

    public static final Pitch pDo2 = Pitch.construct(Pitch.Step.C, 5);
    public static final Pitch pRe2 = Pitch.construct(Pitch.Step.D, 5);
    public static final Pitch pMi2 = Pitch.construct(Pitch.Step.E, 5);
    public static final Pitch pFa2 = Pitch.construct(Pitch.Step.F, 5);
    public static final Pitch pSo2 = Pitch.construct(Pitch.Step.G, 5);
    public static final Pitch pLa2 = Pitch.construct(Pitch.Step.A, 5);
    public static final Pitch pSi2 = Pitch.construct(Pitch.Step.B, 5);

    // symbols
    public static final Symbol tenuto = Symbol.construct(Symbol.Type.TENUTO);
    public static final Symbol rest = Symbol.construct(Symbol.Type.REST);

    //basic chord
    public static final Chord cC3 = new Chord(pDo, pMi, pSo);
    public static final Chord cG3 = new Chord(pSo, pSi, pRe2);
    public static final Chord cF3 = new Chord(pFa, pLa, pDo2);

    public static List<Note> getTestChords() {

        List<Note> target = new ArrayList<>();

        target.add(new ChordNote(cC3, 0.75));
        target.add(new ChordNote(cG3, 0.75));
        target.add(new ChordNote(cG3, 0.75));
        target.add(new ChordNote(cC3, 0.75));
        target.add(new ChordNote(cC3, 0.75));
        target.add(new ChordNote(cF3, 0.75));
        target.add(new ChordNote(cF3, 0.75));
        target.add(new ChordNote(cG3, 0.75));
        target.add(new ChordNote(cF3, 0.75));
        target.add(new ChordNote(cF3, 0.75));

        return target;
    }

}
