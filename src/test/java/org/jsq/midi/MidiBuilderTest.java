package org.jsq.midi;

import org.jsq.MusicSheet;
import org.jsq.core.TemporalMatrix;
import org.jsq.core.TemporalVector;
import org.jsq.core.TestHelper;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

public class MidiBuilderTest {

    private MusicSheet score;

    @Before
    public void setUp() {
        score = new MusicSheet();
        score.setTempo(120);
        score.setOctaveOffset(1);
        score.setSpeedMultiplier(1);
        score.setTimeSignature("3/4");

        TemporalVector chords = new TemporalVector(TestHelper.getTestChords());
        TemporalVector melody = new TemporalVector(TestHelper.getTestMelody());
        score.setScore(new TemporalMatrix(Arrays.asList(chords, melody)));
        //score.setScore(new TemporalMatrix(Arrays.asList(chords)));
        //score.setScore(new TemporalMatrix(Arrays.asList(melody)));

    }

    @Test
    @Ignore("Manually run if needed")
    public void testBuild001() {
        MidiBuilder.newInstance().addScore(score).tryBuild("./BirthdaySong.midi");
    }

}