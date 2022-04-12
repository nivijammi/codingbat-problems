package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Has23Test {
    @Test
    public void shouldReturnTrueIfItContainsA2OrA3One() {
        Has23 object = new Has23();
        int[] nums = {2,5};
        assertTrue(object.has23(nums));
    }
    @Test
    public void shouldReturnTrueIfItContainsA2OrA3Two() {
        Has23 object = new Has23();
        int[] nums = {4,5};
        assertFalse(object.has23(nums));
    }
    @Test
    public void shouldReturnTrueIfItContainsA2OrA3Three() {
        Has23 object = new Has23();
        int[] nums = {3,3};
        assertTrue(object.has23(nums));
    }
    @Test
    public void shouldReturnTrueIfItContainsA2OrA3Four() {
        Has23 object = new Has23();
        int[] nums = {9,5};
        assertFalse(object.has23(nums));
    }
}