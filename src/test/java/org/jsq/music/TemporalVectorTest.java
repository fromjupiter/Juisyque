package org.jsq.music;

import org.jsq.music.core.Chord;
import org.jsq.music.core.Note;
import org.jsq.music.core.ControlTemporal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.jsq.music.TestHelper.*;


public class TemporalVectorTest {

    private TemporalVector target;

    @Before
    public void setUp() {
        target = new TemporalVector();

        target.add(new Chord(cC3, 0.75));
        target.add(new Chord(cC3, 0.75));
        target.add(new Chord(cG3, 0.75));
        target.add(new Chord(cF3, 0.75));
    }

    @Test
    public void testAdd001() {
        target.add(new ControlTemporal(rest));
        Assert.assertEquals(5, target.size());
        Assert.assertEquals(4, target.length(), 0);
    }

    @Test
    public void testAdd002() {
        target.add(2, new Note(pSo, 1.0));
        Assert.assertEquals(target.get(2).getTimeSpan(), 1.0, 0);
        Assert.assertEquals(((Note)target.get(2)).getPitch(), pSo);
    }

    @Test
    public void testLength001() {
        Assert.assertEquals(3, target.length(), 0);
    }

    @Test
    public void testLength002() {
        target.get(0).setSpanBase(2.0);
        Assert.assertEquals(3.75, target.length(), 0);
    }

    @Test
    public void testLength003() {
        Assert.assertEquals( 1.5, target.slice(0,2).length(), 0);
    }

    @Test
    public void testLength004() {
        TemporalVector chords = new TemporalVector(TestHelper.getTestChords());
        TemporalVector melody = new TemporalVector(TestHelper.getTestMelody());
        Assert.assertEquals(chords.length(), melody.length(), 0);

    }
}