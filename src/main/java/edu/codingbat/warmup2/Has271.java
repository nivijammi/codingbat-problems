package edu.codingbat.warmup2;

public class Has271 {
    public boolean has271(int[] nums) {
        // Iterate < length-2, so can use i+1 and i+2 in the loop.
        // Return true immediately when seeing 271.
        for (int i=0; i < (nums.length-2); i++) {
            int val = nums[i];
            if (nums[i+1] == (val+5) &&              // the "7" check
                    Math.abs(nums[i+2] - (val-1)) <= 2) {  // the "1" check
                System.out.println("true");
                return true;
            }
        }

        // If we get here ... none found.
        System.out.println("false");
        return false;
    }
    public static void main(String[]args){
        Has271 has271array = new Has271();
        int[]nums = {1,2,7,1};



    }
}
