package edu.codingbat.array2;

public class has77 {
    /*
        * Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.


    has77([1, 7, 7]) → true
    has77([1, 7, 1, 7]) → true
    has77([1, 7, 1, 1, 7]) → false
    *
    */
    public boolean has77(int[] nums) {
        int length = nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(i< length-1 && nums[i]==7 && nums[i+1]==7){
                return true;
            }
            if( i< length-2 && nums[i]==7 && nums[i+2]==7){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        has77 object = new has77();
        int[] nums = {7,2,7,2,2,7};
    }
}
