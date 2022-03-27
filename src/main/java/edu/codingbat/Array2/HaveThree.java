package edu.codingbat.Array2;

public class HaveThree {
    /*
        Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


    haveThree([3, 1, 3, 1, 3]) → true
    haveThree([3, 1, 3, 3]) → false
    haveThree([3, 4, 3, 3, 4]) → false
     */
    public boolean haveThree(int[] nums){
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 3){
                counter++;
            }

            if(i + 1 < nums.length) {
                if (nums[i] == 3 && nums[i + 1] == 3){
                    System.out.println("false");
                    return false;
                }
            }
        }

        if(counter == 3){
            System.out.println("true");
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        HaveThree object = new HaveThree();
        int[] nums = {3,4,3,4,3,4,4};
        object.haveThree(nums);
    }
}
