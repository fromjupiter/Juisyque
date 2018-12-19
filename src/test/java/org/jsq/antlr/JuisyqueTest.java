package org.jsq.antlr;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class JuisyqueTest {

    private static final String filename = "src/test/resources/org.jsq.antlr/happy_birthday.jsq";

    @Test
    @Ignore("not yet")
    public void compile() throws Exception {
        Juisyque jsq = new Juisyque();

        Object result = jsq.compile(filename);

        Assert.fail();
    }
}