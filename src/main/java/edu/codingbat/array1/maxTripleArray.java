package edu.codingbat.array1;

public class maxTripleArray {
    /*
    Given an array of ints of odd length,
    look at the first, last, and middle values in the array and return the largest.
    The array length will be a least 1.

    maxTriple([1, 2, 3]) → 3
    maxTriple([1, 5, 3]) → 5
    maxTriple([5, 2, 3]) → 5
     */
    public void maxNumOfArray(int[] nums) {
        int largest = 0;
        if (nums.length > 1) {
            if ((nums[0] > nums[1]) && (nums[0] > nums[2])) {
                largest = nums[0];
            } else if ((nums[1] > nums[0]) && (nums[1] > nums[2])) {
                largest = nums[1];
            } else {
                largest = nums[2];
            }
       }
       System.out.println(largest);
    }

    public static void main(String[] args) {
        maxTripleArray object = new maxTripleArray();
        int[] maxTriple = {1, 2, 3};
        int[] maxTriple2 = {9, 5, 6};
        int[] maxTriple3 = {7, 10, 9};
        object.maxNumOfArray(maxTriple2);
    }


}
