package org.jsq.music;

import org.jsq.music.attr.Pitch;
import org.jsq.music.attr.Control;
import org.jsq.music.core.Chord;
import org.jsq.music.core.Temporal;
import org.jsq.music.core.Note;
import org.jsq.music.core.ControlTemporal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestHelper {
    // attr pitch
    static final Pitch pDo = Pitch.construct(Pitch.Step.C, 4);
    static final Pitch pRe = Pitch.construct(Pitch.Step.D, 4);
    static final Pitch pMi = Pitch.construct(Pitch.Step.E, 4);
    static final Pitch pFa = Pitch.construct(Pitch.Step.F, 4);
    static final Pitch pSo = Pitch.construct(Pitch.Step.G, 4);
    static final Pitch pLa = Pitch.construct(Pitch.Step.A, 4);
    static final Pitch pSi = Pitch.construct(Pitch.Step.B, 4);

    static final Pitch pDo2 = Pitch.construct(Pitch.Step.C, 5);
    static final Pitch pRe2 = Pitch.construct(Pitch.Step.D, 5);
    static final Pitch pMi2 = Pitch.construct(Pitch.Step.E, 5);
    static final Pitch pFa2 = Pitch.construct(Pitch.Step.F, 5);
    static final Pitch pSo2 = Pitch.construct(Pitch.Step.G, 5);
    static final Pitch pLa2 = Pitch.construct(Pitch.Step.A, 5);
    static final Pitch pSi2 = Pitch.construct(Pitch.Step.B, 5);

    // symbols
    static final Control tenuto = Control.construct(Control.Type.TENUTO);
    static final Control rest = Control.construct(Control.Type.REST);

    //attr chord
    static final List<Pitch> cC3 = Arrays.asList(pDo, pMi, pSo);
    static final List<Pitch> cG3 = Arrays.asList(pSo, pSi, pRe2);
    static final List<Pitch> cF3 = Arrays.asList(pFa, pLa, pDo2);

    public static List<Temporal> getTestChords() {

        List<Temporal> target = new ArrayList<>();


        target.add(new ControlTemporal(rest, 0.25));

        target.add(new Chord(cC3, 0.75));
        target.add(new Chord(cG3, 0.75));
        target.add(new Chord(cG3, 0.75));
        target.add(new Chord(cC3, 0.75));
        target.add(new Chord(cC3, 0.75));
        target.add(new Chord(cF3, 0.75));
        target.add(new ControlTemporal(tenuto, 0.75));
        target.add(new Chord(cG3, 0.75));
        target.add(new Chord(cC3, 0.75));

        return target;
    }

    public static List<Temporal> getTestMelody() {

        List<Temporal> target = new ArrayList<>();

        target.add(new Note(pSo, 0.125));
        target.add(new Note(pSo, 0.125));

        target.add(new Note(pLa, 0.25));
        target.add(new Note(pSo, 0.25));
        target.add(new Note(pDo2, 0.25));

        target.add(new Note(pSi, 0.25));
        target.add(new ControlTemporal(tenuto, 0.25));
        target.add(new Note(pSo, 0.125));
        target.add(new Note(pSo, 0.125));

        target.add(new Note(pLa, 0.25));
        target.add(new Note(pSo, 0.25));
        target.add(new Note(pRe2, 0.25));

        target.add(new Note(pDo2, 0.25));
        target.add(new ControlTemporal(tenuto, 0.25));
        target.add(new Note(pSo, 0.125));
        target.add(new Note(pSo, 0.125));

        target.add(new Note(pSo2, 0.25));
        target.add(new Note(pMi2, 0.25));
        target.add(new Note(pDo2, 0.25));

        target.add(new Note(pSi, 0.25));
        target.add(new Note(pLa, 0.25));
        target.add(new ControlTemporal(tenuto, 0.25));

        target.add(new ControlTemporal(tenuto, 0.25));
        target.add(new ControlTemporal(rest, 0.25));
        target.add(new Note(pFa2, 0.125));
        target.add(new Note(pFa2, 0.125));

        target.add(new Note(pMi2, 0.25));
        target.add(new Note(pDo2, 0.25));
        target.add(new Note(pRe2, 0.25));

        target.add(new Note(pDo2, 0.25));
        target.add(new ControlTemporal(tenuto, 0.25));
        target.add(new ControlTemporal(rest, 0.25));

        return target;
    }

}
