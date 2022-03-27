package edu.codingbat.Array2;

public class IsEverywhere {

    /*
    * We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
    * at least one of the pair is that value. Return    true if the given value is everywhere in the array.
    IsEverywhere([1, 2, 1, 3], 1) → true
    IsEverywhere([1, 2, 1, 3], 2) → false
    IsEverywhere([1, 2, 1, 3, 4], 1) → false
    */

    public boolean isEverywhereMethod(int[] nums, int val){

        int value =0;
        int nextValue =0;
        for(int i = 0; i < nums.length-1; i++){
            value = nums[i];
            nextValue = nums[i+1];
            if(value != val && nextValue != val){
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;

    }

    public static void main (String[] args){
        IsEverywhere object = new IsEverywhere();
        int[] nums = {1,2,1,3,4};
        object.isEverywhereMethod(nums,1);
    }

}
