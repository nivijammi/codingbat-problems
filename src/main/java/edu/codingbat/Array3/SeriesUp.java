package edu.codingbat.Array3;

/*
Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.


seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]

 */
public class SeriesUp {
    public int [] seriesUp(int n) {

        int length = n*(n+1)/2;
        int[] nums = new int[length];
        for (int i =n; i>0; i--) {
            for (int j = 0; j< i; j++){
                int diff = i-j;
                length =length -1;
                nums[length] = diff;


            }
        }
        print(nums);
        return nums;
    }



    public void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }

    public static void main(String[] args) {
        SeriesUp object = new SeriesUp();
        object.seriesUp(4);
    }
}
