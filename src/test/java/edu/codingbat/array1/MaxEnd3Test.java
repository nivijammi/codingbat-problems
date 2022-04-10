package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxEnd3Test {
    @Test
    public void shouldReturnTheLargestElementAndSetAllElementsToThatValue1() {
        MaxEnd3 object = new MaxEnd3();
        int[] nums = {1,2,3};
        int [] expected ={3,3,3};
        int[] actual = object.maxEnd3(nums);
    }
    @Test
    public void shouldReturnTheLargestElementAndSetAllElementsToThatValue2() {
        MaxEnd3 object = new MaxEnd3();
        int[] nums = {11,3,3};
        int [] expected ={11,11,11};
        int[] actual = object.maxEnd3(nums);
    }
    @Test
    public void shouldReturnTheLargestElementAndSetAllElementsToThatValue3() {
        MaxEnd3 object = new MaxEnd3();
        int[] nums = {2,11,3};
        int [] expected ={3,3,3};
        int[] actual = object.maxEnd3(nums);
    }
    @Test
    public void shouldReturnTheLargestElementAndSetAllElementsToThatValue4() {
        MaxEnd3 object = new MaxEnd3();
        int[] nums = {0,0,1};
        int [] expected ={1,1,1};
        int[] actual = object.maxEnd3(nums);
    }
}