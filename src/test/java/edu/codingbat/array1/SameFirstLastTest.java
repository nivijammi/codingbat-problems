package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SameFirstLastTest {
    @Test
    public void shouldReturnTrueIfArrayLengthGreaterThan1AndFirstAndLastElementIsEqual1() {
        SameFirstLast object = new SameFirstLast();
        int[] nums = {1,2,3};
        assertFalse(object.sameFirstLast(nums));

    }
    @Test
    public void shouldReturnTrueIfArrayLengthGreaterThan1AndFirstAndLastElementIsEqual2() {
        SameFirstLast object = new SameFirstLast();
        int[] nums = {7};
        assertTrue(object.sameFirstLast(nums));

    }
    @Test
    public void shouldReturnTrueIfArrayLengthGreaterThan1AndFirstAndLastElementIsEqual3() {
        SameFirstLast object = new SameFirstLast();
        int[] nums = {};
        assertFalse(object.sameFirstLast(nums));

    }
    @Test
    public void shouldReturnTrueIfArrayLengthGreaterThan1AndFirstAndLastElementIsEqual4() {
        SameFirstLast object = new SameFirstLast();
        int[] nums = {7,7};
        assertTrue(object.sameFirstLast(nums));

    }


}