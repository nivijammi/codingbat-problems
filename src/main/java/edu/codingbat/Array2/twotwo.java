package edu.codingbat.Array2;

public class twotwo {
    /*Given an array of ints, return true if every 2 that appears in the array is next to another 2.


    twoTwo([4, 2, 2, 3]) → true
    twoTwo([2, 2, 4]) → true
    twoTwo([2, 2, 4, 2]) → false
    */

    public boolean twoTwoMethod(int[] nums) {

        if(nums.length == 1 && nums[0] == 2)
            return false;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 2) {
                if(i == 0) { // check the next element
                    if(nums[i+1] != 2)
                        return false;
                }
                else if(i == (nums.length - 1)) { // check the previous element
                    if(nums[i-1] != 2)
                        return false;
                }
                else { // check both
                    if(nums[i+1] != 2 && nums[i-1] != 2)
                        return false;
                }
            }
        }

        return true;
    }


    public static void main(String[] args){
        twotwo object = new twotwo();
        int[] nums = {1,2,3,4};
        boolean returnFlag = object.twoTwoMethod(nums);
        System.out.println(returnFlag);
    }

}
