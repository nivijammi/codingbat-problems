package edu.codingbat.array1;

import java.util.Arrays;

/**
 *
 *         Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that        value. Return the changed array.
 *
 *
 *     maxEnd3([1, 2, 3]) → [3, 3, 3]
 *     maxEnd3([11, 5, 9]) → [11, 11, 11]
 *     maxEnd3([2, 11, 3]) → [3, 3, 3]
 *
 *
 */

public class MaxEnd3 {

    public int[] maxEnd3(int[] nums) {
        int max = 0;
        if(nums[0]>nums[2]) {
            max = nums[0];

        }else{
            max = nums[2];
        }
        int newArray[] = new int[nums.length];
        newArray[0]=max; newArray[1] = max; newArray[2]= max;
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }


}
