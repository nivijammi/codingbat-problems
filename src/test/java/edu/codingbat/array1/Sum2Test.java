package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Sum2Test {
    @Test
    public void shouldReturnTheSumOfFirstTwoElements() {
        Sum2 object = new Sum2();
        int[] nums = {1,2,3};
        int  expected =3;
        int actual = object.sum2(nums);
}
    @Test
    public void shouldReturnTheSumOfFirstTwoElements2() {
        Sum2 object = new Sum2();
        int[] nums = {1,1,1,1};
        int  expected =2;
        int actual = object.sum2(nums);
    }
    @Test
    public void shouldReturnTheSumOfFirstTwoElements3() {
        Sum2 object = new Sum2();
        int[] nums = {};
        int  expected =0;
        int actual = object.sum2(nums);
    }
    @Test
    public void shouldReturnTheSumOfFirstTwoElements4() {
        Sum2 object = new Sum2();
        int[] nums = {4};
        int  expected =4;
        int actual = object.sum2(nums);
    }


}