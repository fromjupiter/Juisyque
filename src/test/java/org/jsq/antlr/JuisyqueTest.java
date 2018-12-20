package org.jsq.antlr;

import org.jsq.exception.JsqInvalidLogicException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class JuisyqueTest {

    private static final String filename = "src/test/resources/org.jsq.antlr/happy_birthday.jsq";

    @Test
    public void testCompile001() throws Exception {
        Juisyque jsq = new Juisyque();
        String testStr = "$g_chord = (G,B,Do+1);$gsharp = G#o4;";
        Object res = jsq.compile(new ByteArrayInputStream(testStr.getBytes()));

        Assert.assertTrue(res instanceof Variables);
        Variables variables = (Variables)res;
        Assert.assertEquals(2, variables.size());
        Assert.assertTrue(variables.containsKey("g_chord"));
        Assert.assertTrue(variables.containsKey("gsharp"));
    }

    @Test
    public void testCompile002() throws Exception {
        Juisyque jsq = new Juisyque();
        String testStr = "$g_chord = (G,B,Do+1);$g_2 = $g_chord;";
        Object res = jsq.compile(new ByteArrayInputStream(testStr.getBytes()));

        Assert.assertTrue(res instanceof Variables);
        Variables variables = (Variables)res;
        Assert.assertEquals(2, variables.size());
        Assert.assertTrue(variables.containsKey("g_chord"));
        Assert.assertTrue(variables.containsKey("g_2"));
    }

    @Test(expected = JsqInvalidLogicException.class)
    public void testCompile003() throws Exception {
        Juisyque jsq = new Juisyque();
        String testStr = "$g_chord = (G,B,Do+1);$g_chord = G;";
        jsq.compile(new ByteArrayInputStream(testStr.getBytes()));
        Assert.fail();
    }

    @Test
    @Ignore("not yet")
    public void testCompile100() throws Exception {
        Juisyque jsq = new Juisyque();

        Object result = jsq.compile(filename);

        Assert.fail();
    }
}