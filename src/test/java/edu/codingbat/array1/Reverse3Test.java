package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Reverse3Test {
    @Test
    public void shouldReturnTheElementsInReverseOrder1() {
        Reverse3 object = new Reverse3();
        int[] nums = {7,2,3};
        int [] expected ={3,2,7};
        int[] actual = object.reverse3(nums);
    }
    @Test
    public void shouldReturnTheElementsInReverseOrder2() {
        Reverse3 object = new Reverse3();
        int[] nums = {2,11,3};
        int [] expected ={3,11,2};
        int[] actual = object.reverse3(nums);
    }
    @Test
    public void shouldReturnTheElementsInReverseOrder3() {
        Reverse3 object = new Reverse3();
        int[] nums = {2,1,2};
        int [] expected ={2,1,2};
        int[] actual = object.reverse3(nums);
    }
    @Test
    public void shouldReturnTheElementsInReverseOrder4() {
        Reverse3 object = new Reverse3();
        int[] nums = {5,11,9};
        int [] expected ={9,11,5};
        int[] actual = object.reverse3(nums);
    }
}