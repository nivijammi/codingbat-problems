package edu.codingbat.array1;

public class midThreeArrays {
    /*
    Given an array of ints of odd length, return a new array
    length 3 containing the elements from the middle of the array.
    The array length will be at least 3.

    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    midThree([1, 2, 3]) → [1, 2, 3]

     */

    private void midThreeMethod(int[] midThree) {
        int[] newArrayOfMid = new int[3];
        for (int i =0; i<midThree.length; i++){
            int midNum = (midThree.length)/2;
            newArrayOfMid[1] = midThree[midNum];
            newArrayOfMid[0] = midThree[midNum-1];
            newArrayOfMid[2] = midThree[midNum+1];
            if (i>0){
                System.out.print(",");
            }
            System.out.print(newArrayOfMid[i]);
        }
    }

    public static void main(String[]args){
        midThreeArrays object = new midThreeArrays();
        int[] midThree = {1,2,3,4,5};
        int[] midThree2 = {8, 6, 7, 5, 3, 0, 9};
        int[] midThree3 = {1, 2, 3};
        object.midThreeMethod(midThree3);

    }


}
