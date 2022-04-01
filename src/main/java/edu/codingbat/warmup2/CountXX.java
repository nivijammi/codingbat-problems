package edu.codingbat.warmup2;

/**
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 *
 *
 * countXX("abcxx") → 1
 * countXX("xxx") → 2
 * countXX("xxxx") → 3
 */

public class CountXX {
    public int countXX(String str) {
        int strLength = str.length();
        int countOfX = 0;

        for (int i = 1; i <strLength; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i - 1) == 'x') {
                countOfX++;
            }
        }
        System.out.println(countOfX);
        return countOfX;
    }

}
