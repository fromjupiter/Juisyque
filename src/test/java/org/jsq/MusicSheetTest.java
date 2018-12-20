package org.jsq;

import org.jsq.exception.JsqInvalidLogicException;
import org.junit.Assert;
import org.junit.Test;

public class MusicSheetTest {

    @Test
    public void testTimeSignature001() {
        MusicSheet score = new MusicSheet();
        Assert.assertEquals("4/4", score.getTimeSignature());
    }

    @Test
    public void testTimeSignature002() throws Exception {
        MusicSheet score = new MusicSheet();

        score.setTimeSignature("3/4");
        Assert.assertEquals("3/4", score.getTimeSignature());
    }

    @Test(expected = JsqInvalidLogicException.class)
    public void testTimeSignature003() throws Exception {
        MusicSheet score = new MusicSheet();

        score.setTimeSignature("fail/me");
        Assert.fail();
    }
}