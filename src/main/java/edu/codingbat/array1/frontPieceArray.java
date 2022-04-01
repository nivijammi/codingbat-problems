package edu.codingbat.array1;

public class frontPieceArray {
    /* Given an int array of any length, return a new array of its first 2 elements.
    If the array is smaller than length 2, use whatever elements are present.
    frontPiece([1, 2, 3]) → [1, 2]
    frontPiece([1, 2]) → [1, 2]
    frontPiece([1]) → [1]
    */
    public void frontPiece(int[] nums) {
        int[] newArray = new int[2];
        if (nums.length >= 2) {
            newArray[0] = nums[0];
            newArray[1] = nums[1];
        } else if (nums.length<2){
            newArray = nums;
        }
        System.out.println(newArray[0]);
        System.out.println(newArray[1]);
    }

    public static void main(String[]args) {
        frontPieceArray object = new frontPieceArray();
        int[] frontPiece1 = {1, 2, 3};
        int[] frontPiece2 = {1, 2};
        int[] frontPiece3 = {1};
        int[] frontPiece4 = {};
        object.frontPiece(frontPiece1);
    }
}

