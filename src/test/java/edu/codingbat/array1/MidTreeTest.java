package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MidTreeTest {
    @Test
    public void shouldReturnANewArrayWith3MiddleElementsOfNumsArray1() {
        MidTree object = new MidTree();
        int[] nums = {1,2,3,4,5};
        int[] expected = {2,3,4};
        int[] actual = object.midThree(nums);
    }
    @Test
    public void shouldReturnANewArrayWith3MiddleElementsOfNumsArray2() {
        MidTree object = new MidTree();
        int[] nums = {8, 6, 7, 5, 3, 0, 9};
        int[] expected = {7,5,3};
        int[] actual = object.midThree(nums);
    }
    @Test
    public void shouldReturnANewArrayWith3MiddleElementsOfNumsArray3() {
        MidTree object = new MidTree();
        int[] nums = {1,2,3};
        int[] expected = {1,2,3};
        int[] actual = object.midThree(nums);
    }
}