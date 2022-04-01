package edu.codingbat.array2;

public class ShiftLeft {
    /*
    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.


    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    shiftLeft([1, 2]) → [2, 1]
    shiftLeft([1]) → [1]

    */

    public int[] shiftLeft(int[] nums) {
        int[] newArr = new int[nums.length];


        if (nums.length>=2){
            //assign a temperory variable to index 0.
            int temp =nums[0];

            for(int i=0; i<nums.length-1;i++){
                //now assign elements of index 1 of nums to newArr[0] and so on
                newArr[i]=nums[i+1];
                //now assign index 0th element to the end of newArr
                newArr[newArr.length-1]=temp;

            }
            for(int i=0;i<newArr.length; i++)
            System.out.println(newArr[i]);
            return newArr;

        }
        return nums;

    }

    public static void main(String[] args){
        ShiftLeft object = new ShiftLeft();
        int[] nums={6,2,5,3};
        object.shiftLeft(nums);
    }
}


