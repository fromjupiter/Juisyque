package org.jsq.core;

import org.jsq.core.note.ChordNote;
import org.jsq.core.note.SymbolNote;
import org.jsq.exception.JsqInvalidAttributeException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.jsq.core.TestHelper.*;

public class NoteMatrixTest {

    NoteMatrix target;

    @Before
    public void setUp() {
        target = new NoteMatrix();

        target.add(new NoteVector());

        target.get(0).add(new ChordNote(cC3, 0.75));
        target.get(0).add(new ChordNote(cC3, 0.75));
        target.get(0).add(new ChordNote(cG3, 0.75));
        target.get(0).add(new ChordNote(cF3, 0.75));
    }

    @Test
    public void testLength001() {
        Assert.assertEquals(3, target.length(), 0);
    }

    @Test
    public void testValidate001() {
        Assert.assertFalse(target.add(new NoteVector()));
        Assert.assertEquals(1, target.size());
    }

    @Test(expected = JsqInvalidAttributeException.class)
    public void testValidate002() throws Exception {
        NoteVector a = new NoteVector();
        NoteVector b = new NoteVector();
        b.add(new ChordNote(cC3, 0.75));

        NoteMatrix t = new NoteMatrix(Arrays.asList(new NoteVector[]{a,b}));
    }

    @Test
    public void testValidate003() {
        NoteVector temp = new NoteVector();
        temp.add(new SymbolNote(tenuto, 0.75));
        temp.add(new SymbolNote(tenuto, 0.75));
        temp.add(new SymbolNote(rest, 0.75));
        temp.add(new SymbolNote(rest, 0.75));
        target.add(temp);

        Assert.assertEquals(2, target.size());
        Assert.assertEquals(3, target.length(), 0);
    }
}