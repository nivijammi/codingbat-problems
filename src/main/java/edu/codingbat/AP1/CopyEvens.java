package edu.codingbat.AP1;

/*
Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.


copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
 */

import java.util.Arrays;

public class CopyEvens {


    public int[] copyEvens(int [] nums, int count){
        int[] even = new int[count];
        int index=0;

        for(int i=0; index<count; i++){
            if(nums[i]% 2==0){
                even[index]= nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(even));
        return even;
    }

    public static void main(String[] args) {
        CopyEvens object = new CopyEvens();
        int nums[] = {3,2,4,5,8};
        int count = 2;
        object.copyEvens(nums, count);
    }
}
