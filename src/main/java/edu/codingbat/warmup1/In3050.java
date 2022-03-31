package edu.codingbat.warmup1;

/**
 * Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
 *
 *
 * in3050(30, 31) → true
 * in3050(30, 41) → false
 * in3050(40, 50) → true
 */

public class In3050 {
    public boolean in3050(int a, int b) {
        if((a>=30 && a<=40) && (b>=30 && b<=40)){
            System.out.println("true");
            return true;

        }
        if ((a>=40 && a<=50) && (b>=40 && b<=50)){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }
}
