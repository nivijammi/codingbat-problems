package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IcyHotTest {
    @Test
    public void shouldReturnTrueIfOnelessthan0AndOneGreaterThan100() {
        IcyHot object = new IcyHot();
        assertTrue(object.icyHot(-1,120));
    }
    @Test
    public void shouldReturnTrueIfOnelessthan0AndOneGreaterThan1001() {
        IcyHot object = new IcyHot();
        assertFalse(object.icyHot(-2,-2));
    }
    @Test
    public void shouldReturnTrueIfOnelessthan0AndOneGreaterThan1002() {
        IcyHot object = new IcyHot();
        assertFalse(object.icyHot(120,120));
    }
}