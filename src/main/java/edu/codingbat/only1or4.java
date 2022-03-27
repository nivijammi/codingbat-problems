package edu.codingbat;

public class only1or4 {
/*
* Given an array of ints, return true if every element is a 1 or a 4.


    only14([1, 4, 1, 4]) → true
    only14([1, 4, 2, 4]) → false
    only14([1, 1]) → true*/

    public boolean only14(int[] nums) {
        for(int i=0;i<nums.length; i++){
            if(nums[i]!=1 && nums[i]!=4){
                System.out.println("false");
                return false;
            }

        }
        System.out.println("true");
        return true;
    }
    public static void main(String[] args){
        only1or4 object = new only1or4();
        int[] nums = {1,4,2,4};
        object.only14(nums);
    }
}
