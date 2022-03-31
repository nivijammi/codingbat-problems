package edu.codingbat.warmup2;

/**
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 *
 *
 * stringTimes("Hi", 2) → "HiHi"
 * stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 */

public class StringTimes {
    public String stringTimes(String str, int n) {
        String largerStr = "";
        for (int counter = 0; counter < n; counter++){
            largerStr = largerStr + str;
        }
        System.out.println(largerStr);
        return largerStr;
    }
}
