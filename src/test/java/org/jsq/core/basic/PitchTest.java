package org.jsq.core.basic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PitchTest {

    Pitch target;

    @Before
    public void setUp() {
        target = Pitch.construct(Pitch.Step.C, 4);
    }
    @Test
    public void testToString() {
        Assert.assertEquals("C", target.toString());
    }

    @Test
    public void testToFullString() {
        Assert.assertEquals("Co4", target.toFullString());
    }

    @Test
    public void testEquals() {
        Assert.assertEquals(target, Pitch.construct(Pitch.Step.C, 4));
        Assert.assertNotEquals(target, Pitch.construct(Pitch.Step.C, 5));
    }

    @Test
    public void testToMidiKey() {
        Assert.assertTrue(target.toMidiKey()==60);
    }

}