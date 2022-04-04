package edu.codingbat.warmup2;

/**
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern:
 * a value, followed by the value plus 5, followed by the value minus 1.
 * Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
 *
 *
 * has271([1, 2, 7, 1]) → true
 * has271([1, 2, 8, 1]) → false
 * has271([2, 7, 1]) → true
 */

public class Has271 {
    public boolean has271(int[] nums) {
        if(nums.length>=2){
            for(int i=0;i<nums.length-2;i++){
                if(nums[i+1] == nums[i]+5 && Math.abs(nums[i+2] - (nums[i]-1)) <= 2){
                    System.out.println("true");
                    return true;

                }
            }
        }
        System.out.println("false");
        return false;
    }
    public static void main(String[]args){
        Has271 has271array = new Has271();
        int[]nums = {1,2,7,1};



    }
}
