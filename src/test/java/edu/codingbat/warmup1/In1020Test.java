package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class In1020Test {
    @Test
    public void shouldReturnTrueIfBetweenTheRangeOf10And20Inclusive1() {
        In1020 object = new In1020();
        assertTrue(object.in1020(12,99));
    }
    @Test
    public void shouldReturnTrueIfBetweenTheRangeOf10And20Inclusive2() {
        In1020 object = new In1020();
        assertFalse(object.in1020(8,99));
    }
    @Test
    public void shouldReturnTrueIfBetweenTheRangeOf10And20Inclusive3() {
        In1020 object = new In1020();
        assertTrue(object.in1020(20,20));
    }
    @Test
    public void shouldReturnTrueIfBetweenTheRangeOf10And20Inclusive4() {
        In1020 object = new In1020();
        assertFalse(object.in1020(9,9));
    }
}