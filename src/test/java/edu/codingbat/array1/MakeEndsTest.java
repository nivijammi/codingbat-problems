package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakeEndsTest {
    @Test
    public void  shouldReturnANewArrayContainingFirstAndLastElementsFromTheOriginalArray1() {
        MakeEnds object = new MakeEnds();
        int[] nums = {2,3,4,1};
        int[] expected ={2,1};
        int [] actual = object.makeEnds(nums);
    }
    @Test
    public void  shouldReturnANewArrayContainingFirstAndLastElementsFromTheOriginalArray2() {
        MakeEnds object = new MakeEnds();
        int[] nums = {7};
        int[] expected ={7,7};
        int [] actual = object.makeEnds(nums);
    }
    @Test
    public void  shouldReturnANewArrayContainingFirstAndLastElementsFromTheOriginalArray3() {
        MakeEnds object = new MakeEnds();
        int[] nums = {1, 2, 2, 2, 2, 2, 2, 3};
        int[] expected ={1,3};
        int [] actual = object.makeEnds(nums);
    }
    @Test
    public void  shouldReturnANewArrayContainingFirstAndLastElementsFromTheOriginalArray4() {
        MakeEnds object = new MakeEnds();
        int[] nums = {1, 2, 3, 4};
        int[] expected ={1,4};
        int [] actual = object.makeEnds(nums);
    }
}