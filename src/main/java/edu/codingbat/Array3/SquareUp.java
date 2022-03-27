package edu.codingbat.Array3;
/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).


squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */
public class SquareUp {
    public int[] squareUp(int n) {
        int[]nums=new int[n*n];
        for(int i=1 ; i<=n ; i++)
            for (int j=1 ; j<=i ; j++)
                nums[i*n-j]=j;

        print(nums);
        return nums;
    }
    public void print(int[]nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }
    public static void main(String[] args) {
        SquareUp Up = new SquareUp();
        Up.squareUp(4);
    }

}
