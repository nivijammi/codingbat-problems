package edu.codingbat.array1;

import java.util.Arrays;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int[] newArray = new int [nums.length*2];
        newArray[newArray.length-1] = nums[nums.length-1];
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
