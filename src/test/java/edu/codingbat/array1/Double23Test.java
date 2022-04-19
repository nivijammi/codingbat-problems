package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Double23Test {
    @Test
    public void shouldReturnTrueIf2Or3OccursTwiceInTheArray1() {
        Double23 object =new Double23();
        int []nums = {2,2};
        assertTrue(object.double23(nums));
    }
    @Test
    public void shouldReturnTrueIf2Or3OccursTwiceInTheArray2() {
        Double23 object =new Double23();
        int []nums = {3,3};
        assertTrue(object.double23(nums));
    }
    @Test
    public void shouldReturnTrueIf2Or3OccursTwiceInTheArray3() {
        Double23 object =new Double23();
        int []nums = {3,4};
        assertFalse(object.double23(nums));
    }
    @Test
    public void shouldReturnTrueIf2Or3OccursTwiceInTheArray4() {
        Double23 object =new Double23();
        int []nums = {3};
        assertFalse(object.double23(nums));
    }
}