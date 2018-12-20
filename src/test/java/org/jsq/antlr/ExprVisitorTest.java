package org.jsq.antlr;

import org.jsq.core.basic.Pitch;
import org.jsq.core.music.Note;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ExprVisitorTest {

    @Test
    public void testVisit001() throws Exception {
        Juisyque jsq = new Juisyque();
        String testStr = "$gsharp = G#o4;";
        Object res = jsq.compile(new ByteArrayInputStream(testStr.getBytes()));

        Assert.assertTrue(res instanceof Variables);
        Variables variables = (Variables)res;
        Assert.assertTrue(variables.containsKey("gsharp"));

        Assert.assertEquals(new Note(Pitch.construct(Pitch.Step.GSHARP, 4)), variables.get("gsharp").getValue());
    }
}
