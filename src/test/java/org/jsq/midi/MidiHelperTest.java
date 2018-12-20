package org.jsq.midi;

import org.jsq.MusicSheet;
import org.jsq.core.TemporalMatrix;
import org.jsq.core.TemporalVector;
import org.jsq.core.TestHelper;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MidiHelperTest {

    private double testDelta = 0.000001;
    @Test
    public void testPPQ() {
        MusicSheet score = new MusicSheet();
        score.setTempo(70);
        score.setTimeSignature("3/4");
        score.setSpeedMultiplier(8.0);

        TemporalVector chords = new TemporalVector(TestHelper.getTestChords());
        TemporalVector melody = new TemporalVector(TestHelper.getTestMelody());
        score.setScore(new TemporalMatrix(Arrays.asList(chords, melody)));

        int result = MidiHelper.getPPQ(Arrays.asList(score));
        Assert.assertEquals(16, result);
    }

    @Test
    public void testGetNoteTick() {
        MusicSheet score = new MusicSheet();
        score.setTempo(70);
        score.setTimeSignature("3/4");
        score.setSpeedMultiplier(1.0);

        TemporalVector chords = new TemporalVector(TestHelper.getTestChords());
        TemporalVector melody = new TemporalVector(TestHelper.getTestMelody());
        score.setScore(new TemporalMatrix(Arrays.asList(chords, melody)));

        int ppq = MidiHelper.getPPQ(Arrays.asList(score));

        Assert.assertEquals(6, MidiHelper.getNoteTick(ppq, score.getSpeedMultiplier(), chords.get(1)));
        Assert.assertEquals(2, MidiHelper.getNoteTick(ppq, score.getSpeedMultiplier(), melody.get(3)));

    }
    @Test
    public void testGCD001() {
        double result = MidiHelper.GCD(0.3, 0.9);
        Assert.assertEquals(0.3, result, testDelta);
    }

    @Test
    public void testGCD002() {
        double result = MidiHelper.GCD(0.3, 0.2);
        Assert.assertEquals(0.1, result, testDelta);
    }

    @Test
    public void testGCD003() {
        double result = MidiHelper.GCD(0.73, 0.5);
        Assert.assertEquals(0.01, result, testDelta);
    }

    @Test
    public void testGCD004() {
        double result = MidiHelper.GCD(1, 3.7);
        Assert.assertEquals(0.1, result, testDelta);
    }
}