package org.jsq.antlr;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VariableTest {

    @Test
    public void testToString001() {
        Variable var = new Variable("test", 1000);
        Assert.assertEquals("$test = 1000", var.toString());
    }
}