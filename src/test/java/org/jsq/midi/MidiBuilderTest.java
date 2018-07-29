package org.jsq.midi;

import org.jsq.MusicSheet;
import org.jsq.core.NoteMatrix;
import org.jsq.core.NoteVector;
import org.jsq.core.TestHelper;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

public class MidiBuilderTest {

    MusicSheet score;

    @Before
    public void setUp() throws Exception {
        score = new MusicSheet();
        score.setTempo(70);
        score.setTimeSignature("3/4");
        score.setSpeedMultiplier(1);

        NoteVector chords = new NoteVector(TestHelper.getTestChords());
        NoteVector melody = new NoteVector(TestHelper.getTestMelody());
        score.setScore(new NoteMatrix(Arrays.asList(chords, melody)));
        //score.setScore(new NoteMatrix(Arrays.asList(chords)));
        //score.setScore(new NoteMatrix(Arrays.asList(melody)));

    }

    @Test
    @Ignore("Manually run if needed")
    public void testBuild001() {
        MidiBuilder.newInstance().addScore(score).tryBuild("./BirthdaySong.midi");
    }

}