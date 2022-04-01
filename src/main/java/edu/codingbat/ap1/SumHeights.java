package edu.codingbat.ap1;
/*
We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6. The start end end index will both be valid indexes into the array with start <= end.


sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
 */

public class SumHeights {
    public int sumHeights(int[] heights, int start, int end) {
        int sum =0;
        for(int i=start; i<end; i++){
            sum = sum + Math.abs(heights[i]-heights[i+1]);
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        SumHeights object = new SumHeights();
        int[] heights ={5,3,6,7,2};
        int start = 0;
        int end = 4;
        object.sumHeights(heights,start,end);
    }
}
