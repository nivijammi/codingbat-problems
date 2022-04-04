package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Array667Test {
    @Test
    public void shouldReturnTheCountWhenTwo6AreNextToEachOtherAndAloWhereSecond6IsA7One() {
        Array667 object = new Array667();
        int[] nums = {1, 2, 3, 6, 6};
        int expected =1;
        int actual = object.array667(nums);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnTheCountWhenTwo6AreNextToEachOtherAndAloWhereSecond6IsA7Two() {
        Array667 object = new Array667();
        int[] nums = {6, 7, 6, 6};
        int expected =2;
        int actual = object.array667(nums);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnTheCountWhenTwo6AreNextToEachOtherAndAloWhereSecond6IsA7Three() {
        Array667 object = new Array667();
        int[] nums = {6,1};
        int expected =0;
        int actual = object.array667(nums);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnTheCountWhenTwo6AreNextToEachOtherAndAloWhereSecond6IsA7Four() {
        Array667 object = new Array667();
        int[] nums = {};
        int expected =0;
        int actual = object.array667(nums);
        assertEquals(expected,actual);
    }
}