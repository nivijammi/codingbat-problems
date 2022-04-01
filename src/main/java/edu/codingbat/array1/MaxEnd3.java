package edu.codingbat.array1;

public class MaxEnd3 {
    /*
        Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that        value. Return the changed array.


    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]

     */
    public int[] maxEnd3(int[] nums, int b) {
        int n = nums.length;
        if (nums[0]>nums[n-1]){
            int[] newArray = {nums[0], nums[0], nums[0]};
            return newArray;
        }
        else{
            int[] newArray = {nums[n-1],nums[n-1],nums[n-1]};
            return newArray;
        }

    }

    public boolean foo2(int[] nums, int b) {
        int n = nums.length;
        return nums[0] > nums[n - 1];

    }

    public static void main(String[]args){
        MaxEnd3 object = new MaxEnd3();
        int[] a = {1,2,3};//creating and intializing the array. however arrays are created by iterating through some list and creating the array.
        int b = 100;
        int[] c = object.maxEnd3(a, b);
        boolean d = object.foo2(a, b);


    }
}
