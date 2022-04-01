package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleXTest {
    @Test
    public void shouldReturnTrueifTheFirstXIsFollowedByAnotherX1() {
        DoubleX object = new DoubleX();
        assertTrue(object.doubleX("axxbb"));
    }

    @Test
    public void shouldReturnTrueifTheFirstXIsFollowedByAnotherX2() {
        DoubleX object = new DoubleX();
        assertFalse(object.doubleX("axaxax"));
    }

    @Test
    public void shouldReturnTrueifTheFirstXIsFollowedByAnotherX3() {
        DoubleX object = new DoubleX();
        assertFalse(object.doubleX("xaxx"));
    }
}


