package org.jsq.antlr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VariablesTest {

    Variables variables;

    @Before
    public void setUp() {
        variables = new Variables();
    }

    @Test
    public void testAdd001() {
        variables.add(new Variable("test"));
        Assert.assertEquals(1, variables.size());
    }

    @Test
    public void testUpdate001() {
        variables.add(new Variable("test"));
        variables.update("test", new Variable("test", 5));
        Assert.assertEquals(5, variables.get("test").getValue());
    }

    @Test
    public void testUpdate002() {
        Assert.assertFalse( variables.update("test", new Variable("notSameKey")));
    }

}