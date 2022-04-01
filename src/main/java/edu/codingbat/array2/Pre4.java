package edu.codingbat.array2;

public class Pre4 {
    /*Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.


    pre4([1, 2, 4, 1]) → [1, 2]
    pre4([3, 1, 4]) → [3, 1]
    pre4([1, 4, 4]) → [1]
    */
    public int[] pre4Method(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==4){
                count = i;
                break;
            }
        }
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i]=nums[i];
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args){
        Pre4 object = new Pre4();
        int[] nums = {1,2,4,1};
        object.pre4Method(nums);
    }
}
