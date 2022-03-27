package edu.codingbat;

public class centeredAverage {
    /*
    Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.


centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
     */


    public int centeredAverageMethod(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;
        int average = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]>max) {
                max = nums[i];

            }

            else if(nums[i]<min) {
                min = nums[i];

            }

            sum = sum + nums[i];

        }
        System.out.println("The max number of array is : " + max);
        System.out.println("The min number of array is : " + min);
        System.out.println("The sum of array is : " + sum);
        average = (sum -(min+max))/ (nums.length-2);
        System.out.println("The average of array is : " + average);
        return average;
    }

    public static void main(String[]args){

        centeredAverage object = new centeredAverage();
        int[] nums = {100, 2, 3, 4, 1};
        int[] nums1 = {1, 1, 5, 5, 10, 8, 7};
        int[] nums2 = {-10, -4, -2, -4, -2, 0};
        object.centeredAverageMethod(nums2);
    }
}



