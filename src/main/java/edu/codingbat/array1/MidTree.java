package edu.codingbat.array1;

import java.util.Arrays;

/**
Given an array of ints of odd length, return a new array length 3
containing the elements from the middle of the array.
The array length will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
 */

public class MidTree {
    public int[] midThree(int[] nums) {
        int[] newArray = new int[3];
        if(nums.length==3){
            System.out.println(Arrays.toString(nums));
            return nums;
        }
        if(nums.length>3) {
            int index = nums.length / 3;
            newArray[0] = nums[index];
            newArray[1]= nums[index +1];
            newArray[2] = nums[index + 2];

        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
