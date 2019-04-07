package org.jsq.antlr.visitor;

import org.jsq.antlr.Juisyque;
import org.jsq.antlr.Variables;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Map;

import static org.junit.Assert.*;

public class DictVisitorTest {
    public static Juisyque jsq;

    @Before
    public void init() {
        jsq = new Juisyque();
    }

    @Test
    public void testVisit001() throws Exception {
        String testStr = "$dic = {'tempo':77, 'tonic':'C'};";
        Variables world = (Variables) jsq.compile(new ByteArrayInputStream(testStr.getBytes()));
        Assert.assertEquals(1, world.size());
        Map<String, Object> dic = (Map<String, Object>) world.get("dic").getValue();
        Assert.assertEquals(dic.get("tempo"), 77);
        Assert.assertEquals("C", dic.get("tonic"));
    }

    @Test
    public void testVisit002() throws Exception {
        String testStr = "$dic = {};";
        Variables world = (Variables) jsq.compile(new ByteArrayInputStream(testStr.getBytes()));
        Assert.assertEquals(1, world.size());
        Map<String, Object> dic = (Map<String, Object>) world.get("dic").getValue();
        Assert.assertEquals(dic.size(), 0);
    }
}