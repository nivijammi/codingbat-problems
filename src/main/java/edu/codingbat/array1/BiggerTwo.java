package edu.codingbat.array1;

import java.util.Arrays;

/**
 * Start with 2 int arrays, a and b, each length 2.
 * Consider the sum of the values in each array.
 * Return the array which has the largest sum. In event of a tie, return a.
 *
 *
 * biggerTwo([1, 2], [3, 4]) → [3, 4]
 * biggerTwo([3, 4], [1, 2]) → [3, 4]
 * biggerTwo([1, 1], [1, 2]) → [1, 2]
 */

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        if (a.length >= 2 && b.length >= 2) {
            int sumOfA = a[0] + a[1];
            int sumOfB = b[0] + b[1];


            if (sumOfA >= sumOfB) {
                System.out.println(Arrays.toString(a));
                return a;
            } else {
                    System.out.println(Arrays.toString(b));
                    return b;
            }
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}
