package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFront9Test {
    @Test
    public void shouldReturnTrueIfOneOfTheFirst4elementsIsA91() {
        ArrayFront9 object = new ArrayFront9();
        int[] nums = {3,9,2,3,3};
        assertTrue(object.arrayFront9(nums));
    }
    @Test
    public void shouldReturnTrueIfOneOfTheFirst4elementsIsA92() {
        ArrayFront9 object = new ArrayFront9();
        int[] nums = {1, 2, 3, 4, 5};
        assertFalse(object.arrayFront9(nums));
    }
    @Test
    public void shouldReturnTrueIfOneOfTheFirst4elementsIsA93() {
        ArrayFront9 object = new ArrayFront9();
        int[] nums = {1, 9, 9};
        assertTrue(object.arrayFront9(nums));
    }
    @Test
    public void shouldReturnTrueIfOneOfTheFirst4elementsIsA94() {
        ArrayFront9 object = new ArrayFront9();
        int[] nums = {5, 5};
        assertFalse(object.arrayFront9(nums));
    }
}