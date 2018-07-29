package org.jsq.core;

import org.jsq.core.note.ChordNote;
import org.jsq.core.note.PitchNote;
import org.jsq.core.note.SymbolNote;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.jsq.core.TestHelper.*;


public class NoteVectorTest {

    NoteVector target;

    @Before
    public void setUp() {
        target = new NoteVector();

        target.add(new ChordNote(cC3, 0.75));
        target.add(new ChordNote(cC3, 0.75));
        target.add(new ChordNote(cG3, 0.75));
        target.add(new ChordNote(cF3, 0.75));
    }

    @Test
    public void testAdd001() {
        target.add(new SymbolNote(rest));
        Assert.assertEquals(5, target.size());
        Assert.assertEquals(4, target.length(), 0);
    }

    @Test
    public void testAdd002() {
        target.add(2, new PitchNote(pSo, 1.0));
        Assert.assertEquals(target.get(2).getTimeSpan(), 1.0, 0);
        Assert.assertEquals(((PitchNote)target.get(2)).getPitch(), pSo);
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
        NoteVector chords = new NoteVector(TestHelper.getTestChords());
        NoteVector melody = new NoteVector(TestHelper.getTestMelody());
        Assert.assertEquals(chords.length(), melody.length(), 0);

    }
}