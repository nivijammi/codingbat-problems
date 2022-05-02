package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTripleTest {
    @Test
    public void shouldReturnThelargestValueOutOfFirstLastOrMiddleValue1() {
        MaxTriple object = new MaxTriple();
        int expected = 5;
        int[] nums = {2,2,5,1,1};
        int actual = object.maxTriple(nums);
    }
    @Test
    public void shouldReturnThelargestValueOutOfFirstLastOrMiddleValue2() {
        MaxTriple object = new MaxTriple();
        int expected = 9;
        int[] nums = {5,1,7,9,7,8,1};
        int actual = object.maxTriple(nums);
    }
    @Test
    public void shouldReturnThelargestValueOutOfFirstLastOrMiddleValue3() {
        MaxTriple object = new MaxTriple();
        int expected = 5;
        int[] nums = {5, 1, 3, 7, 1};
        object.maxTriple(nums);
    }
    @Test
    public void shouldReturnThelargestValueOutOfFirstLastOrMiddleValue4() {
        MaxTriple object = new MaxTriple();
        int expected = 5;
        int[] nums = {5,2,3};
        object.maxTriple(nums);
    }
}