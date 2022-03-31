package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoneTeenTest {
    @Test
    public void  shouldReturnTrueIfNumIsInTheRange13To19Inclusive1() {
        LoneTeen object = new LoneTeen();
        assertTrue(object.loneTeen(99, 13) );
    }
    @Test
    public void  shouldReturnTrueIfNumIsInTheRange13To19Inclusive2() {
        LoneTeen object = new LoneTeen();
        assertTrue(object.loneTeen(20, 15));
    }
    @Test
    public void  shouldReturnTrueIfNumIsInTheRange13To19Inclusive3() {
        LoneTeen object = new LoneTeen();
        assertFalse(object.loneTeen(13, 19) );
    }
    @Test
    public void  shouldReturnTrueIfNumIsInTheRange13To19Inclusive4() {
        LoneTeen object = new LoneTeen();
        assertFalse(object.loneTeen(99, 99));
    }
}