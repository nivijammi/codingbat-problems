package edu.codingbat.Array1;

public class Unlucky1 {

    public boolean frontNumbers(int[] nums) {
        if (nums.length < 2)  System.out.println("false");

         if(nums[0] == 1 && nums[1] == 3 ||
                nums[1] == 1 && nums[2] == 3 ||
                nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) System.out.println("true");
         else System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        Unlucky1 object = new Unlucky1();
        int[] unlucky = {1, 3, 4, 5};
        int[] unlucky1 = {2, 1, 3, 4, 5};
        int[] unlucky2 = {1, 1, 1};
        object.frontNumbers(unlucky2);
    }


}
