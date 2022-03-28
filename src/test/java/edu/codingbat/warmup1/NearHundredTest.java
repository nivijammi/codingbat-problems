package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NearHundredTest {
    @Test
    public void shouldReturnTrueIf10or100or200() {
        NearHundred object = new NearHundred();
        assertFalse("not near 200", object.nearHundred(290));
    }
    @Test
    public void shouldReturnTrueIf10or100or2001() {
        NearHundred object = new NearHundred();
        assertFalse("not near 0", object.nearHundred(-290));
    }
    @Test
    public void shouldReturnTrueIf10or100or2002() {
        NearHundred object = new NearHundred();
        assertTrue("not near 200", object.nearHundred(191));
    }
}