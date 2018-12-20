package org.jsq.core;

import org.jsq.core.music.Chord;
import org.jsq.core.music.ControlTemporal;
import org.jsq.exception.JsqInvalidLogicException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.jsq.core.TestHelper.*;

public class TemporalMatrixTest {

    TemporalMatrix target;

    @Before
    public void setUp() {
        target = new TemporalMatrix();

        target.add(new TemporalVector());

        target.get(0).add(new Chord(cC3, 0.75));
        target.get(0).add(new Chord(cC3, 0.75));
        target.get(0).add(new Chord(cG3, 0.75));
        target.get(0).add(new Chord(cF3, 0.75));
    }

    @Test
    public void testLength001() {
        Assert.assertEquals(3, target.length(), 0);
    }

    @Test
    public void testValidate001() {
        Assert.assertFalse(target.add(new TemporalVector()));
        Assert.assertEquals(1, target.size());
    }

    @Test(expected = JsqInvalidLogicException.class)
    public void testValidate002() throws Exception {
        TemporalVector a = new TemporalVector();
        TemporalVector b = new TemporalVector();
        b.add(new Chord(cC3, 0.75));

        TemporalMatrix t = new TemporalMatrix(Arrays.asList(new TemporalVector[]{a,b}));
    }

    @Test
    public void testValidate003() {
        TemporalVector temp = new TemporalVector();
        temp.add(new ControlTemporal(tenuto, 0.75));
        temp.add(new ControlTemporal(tenuto, 0.75));
        temp.add(new ControlTemporal(rest, 0.75));
        temp.add(new ControlTemporal(rest, 0.75));
        target.add(temp);

        Assert.assertEquals(2, target.size());
        Assert.assertEquals(3, target.length(), 0);
    }
}