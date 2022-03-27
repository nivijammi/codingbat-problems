package edu.codingbat.Array3;
/*
(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.


fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]

*/

public class Fix45 {
    public int[] fix45(int[] nums) {
        int temp = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            for(int j=nums.length-1; j>=0; j--){


                if(nums[i]==5 && nums[j]==4) {
                    if (nums[j+1] != 5) {
                        swap(nums,j+1,i);

                    }
                }

                }
            }
        print(nums);
        return nums;
    }
    public void swap(int[]array, int i, int j){
        int temp = array[i];
        array[i]= array[j];
        array[j] = temp;
    }

    public void print(int[]nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }


    public static void main(String[]args) {
        Fix45 object = new Fix45();
        int[] array = {4, 9, 4, 9, 5, 5, 4, 9, 5};
        object.fix45(array);

    }

}
