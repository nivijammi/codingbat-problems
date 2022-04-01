package edu.codingbat.array3;

public class fix34Array {
    /*
    Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.


fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

     */

    public int[] fix34Array(int[] nums){
        int indexOfFour = 0;
        int temp =0;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==4){
                indexOfFour = i;
                temp = nums[i];

            }
            if(nums[i] != 3){
                arr[i]=nums[i];

            }
            if(nums[i]==3){
                if(nums[i+1]!=4){
                    arr[i]=nums[i];
                    nums[indexOfFour]=nums[i+1];
                    arr[i+1]=temp;
                    System.out.print(arr[i]);

                }
            }


        }

        return arr;
    }
    public static void main(String[] args){
        fix34Array object = new fix34Array();
        int[] nums = {1,3,4,1};
        object.fix34Array(nums);
    }

}
