package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Sum3Test {
    @Test
    public void shouldReturnTheSumOfAllElements1() {
        Sum3 object = new Sum3();
        int[] nums = {1,2,3};
        int expected =6;
        int actual = object.sum3(nums);
    }
    @Test
    public void shouldReturnTheSumOfAllElements2() {
        Sum3 object = new Sum3();
        int[] nums = {5,11,2};
        int expected =18;
        int actual = object.sum3(nums);
    }
    @Test
    public void shouldReturnTheSumOfAllElements3() {
        Sum3 object = new Sum3();
        int[] nums = {7,0,0};
        int expected =7;
        int actual = object.sum3(nums);
    }
    @Test
    public void shouldReturnTheSumOfAllElements4() {
        Sum3 object = new Sum3();
        int[] nums = {2,7,2};
        int expected =11;
        int actual = object.sum3(nums);
    }
}