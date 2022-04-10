package edu.codingbat.array1;

public class MakeMiddleArray {
    /*
    Given an array of ints of even length, return a new array length 2
    containing the middle two elements from the original array.
    The original array will be length 2 or more.

    makeMiddle([1, 2, 3, 4]) → [2, 3]
    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    makeMiddle([1, 2]) → [1, 2]
     */

    public void getMiddle(int[] nums) {
        int [] newMid = new int [2];
        for (int i=0; i<nums.length;i++){
            int mid = nums.length/2;
            newMid[0] = nums[mid-1];
            newMid[1] = nums[mid];
            if(i>0){
                System.out.print(",");
            }
            System.out.print(newMid[i]);

        }
    }

    public static void main(String[]args){
        MakeMiddleArray object = new MakeMiddleArray();
        int[] nums = {1,2,3,4};
        int[] nums2 = {7, 1, 6, 7, 4, 9};
        int[] nums3 = {4,5};
        object.getMiddle(nums3);
    }
}
