package org.jsq.core.music;

import org.jsq.NoteUtils;
import org.junit.Assert;
import org.junit.Test;


public class ChordTest {

    private Chord testChord;

    @Test
    public void testSize001() {
        testChord = new Chord(NoteUtils.makePitch("G"),NoteUtils.makePitch("B"),NoteUtils.makePitch("D"));
        Assert.assertEquals(3, testChord.size());
    }

    @Test
    public void testSetTimeSpan001() {
        testChord = new Chord(NoteUtils.makePitch("G"),NoteUtils.makePitch("B"),NoteUtils.makePitch("D"));
        Assert.assertEquals(new Double(1.0), testChord.getTimeSpan());
        testChord.setTimeSpan(100.0);
        Assert.assertEquals(new Double(100.0), testChord.getTimeSpan());
    }

    @Test
    public void testGet001() {
        testChord = new Chord(NoteUtils.makePitch("G"),NoteUtils.makePitch("B"),NoteUtils.makePitch("D"));
        Assert.assertEquals(NoteUtils.makeTemporal("G"), testChord.get(0));
        Assert.assertEquals(NoteUtils.makeTemporal("B"), testChord.get(1));
        Assert.assertEquals(NoteUtils.makeTemporal("D"), testChord.get(2));

    }
}