package org.jsq;

import org.jsq.core.basic.Pitch;
import org.jsq.core.note.PitchNote;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoteUtilsTest {

    @Test
    public void testMakePitch001() throws Exception {
        Pitch pitch = NoteUtils.makePitch("Go+4");
        Assert.assertEquals(4,pitch.getOctave());
        Assert.assertEquals(Pitch.Step.G,pitch.getStep());
    }

    @Test
    public void testMakePitch002() throws Exception {
        Pitch pitch = NoteUtils.makePitch("G#o-4");
        Assert.assertEquals(-4,pitch.getOctave());
        Assert.assertEquals(Pitch.Step.GSHARP,pitch.getStep());
    }

    @Test
    public void testMakePitch003() throws Exception {
        Pitch pitch = NoteUtils.makePitch("Gb");
        Assert.assertEquals(0,pitch.getOctave());
        Assert.assertEquals(Pitch.Step.GFLAT,pitch.getStep());
    }
}