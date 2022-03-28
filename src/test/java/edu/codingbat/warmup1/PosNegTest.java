package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PosNegTest {
    @Test
    public void shouldReturnTrueIfOneNegAndOnePos() {
        PosNeg object = new PosNeg();
        assertTrue("one is pos and one is neg", object.posNeg(1,-1,false));
    }
    @Test
    public void shouldReturnTrueIfOneNegAndOnePos1() {
        PosNeg object = new PosNeg();
        assertTrue("one is pos and one is neg", object.posNeg(-6,6,false));
    }
    @Test
    public void shouldReturnTrueIfOneNegAndOnePos2() {
        PosNeg object = new PosNeg();
        assertTrue("one is pos and one is neg", object.posNeg(-5,-5,true));
    }
    @Test
    public void shouldReturnTrueIfOneNegAndOnePos3() {
        PosNeg object = new PosNeg();
        assertFalse("one is pos and one is neg", object.posNeg(-1,1,true));
    }
    @Test
    public void shouldReturnTrueIfOneNegAndOnePos4() {
        PosNeg object = new PosNeg();
        assertFalse("both neg", object.posNeg(-5,-6,false));
    }
    @Test
    public void shouldReturnTrueIfOneNegAndOnePos5() {
        PosNeg object = new PosNeg();
        assertFalse("both pos", object.posNeg(1,2,true));
    }
    @Test
    public void shouldReturnTrueIfOneNegAndOnePos6() {
        PosNeg object = new PosNeg();
        assertFalse("one is pos and one is neg", object.posNeg(-5,6,true));
    }
}