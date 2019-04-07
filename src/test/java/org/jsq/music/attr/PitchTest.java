package org.jsq.music.attr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PitchTest {

    Pitch target;

    @Before
    public void setUp() {
        target = Pitch.construct(Pitch.Step.C, 4);
    }

    @Test
    public void testToString001() {
        Assert.assertEquals("C", target.toString());
    }

    @Test
    public void testToString002() {
        Assert.assertEquals("C#", Pitch.construct(Pitch.Step.CSHARP, 4).toString());
    }

    @Test
    public void testToString003() {
        Assert.assertEquals("Cb", Pitch.construct(Pitch.Step.CFLAT, 4).toString());
    }

    @Test
    public void testToFullString() {
        Assert.assertEquals("C4", target.toFullString());
    }

    @Test
    public void testValue001() {
        Assert.assertNotEquals(Pitch.construct(Pitch.Step.CSHARP, 4), Pitch.construct(Pitch.Step.DFLAT, 4));
        Assert.assertEquals(Pitch.Step.CSHARP.toInt(), Pitch.Step.DFLAT.toInt());
    }

    @Test
    public void testEquals001() {
        Assert.assertEquals(target, Pitch.construct(Pitch.Step.C, 4));
        Assert.assertNotEquals(target, Pitch.construct(Pitch.Step.C, 5));
    }

    @Test
    public void testToMidiKey() {
        Assert.assertEquals(60, target.toMidiKey());
    }

}