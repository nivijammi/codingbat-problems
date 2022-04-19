package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class No23Test {
    @Test
    public void shouldReturnTrueIfDoesNotContain2Or3One() {
        No23 object = new No23();
        int[] nums = {4,5};
        assertTrue(object.no23(nums));
    }
    @Test
    public void shouldReturnTrueIfDoesNotContain2Or3Two() {
        No23 object = new No23();
        int[] nums = {3,5};
        assertFalse(object.no23(nums));
    }
    @Test
    public void shouldReturnTrueIfDoesNotContain2Or3Three() {
        No23 object = new No23();
        int[] nums = {1,3};
        assertFalse(object.no23(nums));
    }
    @Test
    public void shouldReturnTrueIfDoesNotContain2Or3Four() {
        No23 object = new No23();
        int[] nums = {8,7};
        assertTrue(object.no23(nums));
    }




}