package edu.codingbat.array3;
/*
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
 */

public class CanBalance{
    public boolean canBalance(int[] nums) {

        int leftCount = 0;
        int rightCount = 0;
        int sum=0;


        for(int num: nums){
            sum = sum+num;
        }
        System.out.println("Sum is :"+ sum);

        for(int i= 0; i<nums.length;i++){
            leftCount = leftCount + nums[i];
            rightCount = sum - leftCount;

            if(rightCount==leftCount){
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        CanBalance CB = new CanBalance();
        int[] nums = {10,10};
        CB.canBalance(nums);
    }
}
/*
public boolean canBalance(int[] nums) {

        int leftCount = 0;
        int rightCount = 0;

        for(int i=0; i<nums.length; i++){
            leftCount = leftCount + nums[i];
            for(int j= nums.length-1; j>i; j--){
                rightCount = rightCount + nums[j];

                if(rightCount==leftCount )

                    return true;

            }

        }

        return false;
    }
 */