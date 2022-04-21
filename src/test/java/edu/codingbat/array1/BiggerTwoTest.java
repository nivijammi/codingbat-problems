package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class BiggerTwoTest {
    @Test
    public void shouldReturnTheArrayWithGreaterSumOfElements1() {
        BiggerTwo object = new BiggerTwo();
        int[] a = {6,7};
        int[] b = {3,1};
        int[] expected = {6,7};
        int[] actual = object.biggerTwo(a,b);
    }
    @Test
    public void shouldReturnTheArrayWithGreaterSumOfElements2() {
        BiggerTwo object = new BiggerTwo();
        int[] a = {3,4};
        int[] b = {1,2};
        int[] expected = {3,4};
        int[] actual = object.biggerTwo(a,b);
    }
    @Test
    public void shouldReturnTheArrayWithGreaterSumOfElements3() {
        BiggerTwo object = new BiggerTwo();
        int[] a = {1,1};
        int[] b = {1,2};
        int[] expected = {1,2};
        int[] actual = object.biggerTwo(a,b);
    }
    @Test
    public void shouldReturnTheArrayWithGreaterSumOfElements4() {
        BiggerTwo object = new BiggerTwo();
        int[] a = {2,2};
        int[] b = {1,3};
        int[] expected = {2,2};
        int[] actual = object.biggerTwo(a,b);
    }
}