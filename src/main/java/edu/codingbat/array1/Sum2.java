package edu.codingbat.array1;

/**
 * Given an array of ints, return the sum of the first 2 elements in the array.
 * If the array length is less than 2, just sum up the elements that exist,
 * returning 0 if the array is length 0.
 *
 *
 * sum2([1, 2, 3]) → 3
 * sum2([1, 1]) → 2
 * sum2([1, 1, 1, 1]) → 2
 */

public class Sum2 {
    public int sum2(int[] nums) {
        int sumOf2 =0;
        if(nums.length>1){
            sumOf2 =nums[0]+nums[1] ;
            System.out.println(sumOf2);
            return sumOf2 ;

        }
        if(nums.length==1){
            sumOf2 = nums[0];
            System.out.println(sumOf2);
            return sumOf2;
        }
        else{
            System.out.println(0);
            return 0;
        }
    }

}
