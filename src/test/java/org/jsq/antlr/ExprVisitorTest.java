package org.jsq.antlr;

import org.jsq.NoteUtils;
import org.jsq.core.basic.Pitch;
import org.jsq.core.music.Chord;
import org.jsq.core.music.Note;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ExprVisitorTest {

    @Test
    public void testVisitNote001() throws Exception {
        Juisyque jsq = new Juisyque();
        String testStr = "$gsharp = G#o4;";
        Object res = jsq.compile(new ByteArrayInputStream(testStr.getBytes()));

        Assert.assertTrue(res instanceof Variables);
        Variables variables = (Variables)res;
        Assert.assertTrue(variables.containsKey("gsharp"));

        Assert.assertEquals(new Note(Pitch.construct(Pitch.Step.GSHARP, 4)), variables.get("gsharp").getValue());
    }

    @Test
    public void testVisitChord001() throws Exception {
        Juisyque jsq = new Juisyque();
        String testStr = "$g_chord = (G,B,Do+1);";
        Object res = jsq.compile(new ByteArrayInputStream(testStr.getBytes()));

        Assert.assertTrue(res instanceof Variables);
        Variables variables = (Variables)res;
        Assert.assertTrue(variables.containsKey("g_chord"));

        Chord chord = (Chord) variables.get("g_chord").getValue();
        Assert.assertEquals(3, chord.size());
        Assert.assertEquals(NoteUtils.makeTemporal("G"), chord.get(0));
        Assert.assertEquals(NoteUtils.makeTemporal("B"), chord.get(1));
        Assert.assertEquals(NoteUtils.makeTemporal("Do+1"), chord.get(2));
    }
}
