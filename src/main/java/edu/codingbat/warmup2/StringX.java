package edu.codingbat.warmup2;

/**
 * Given a string, return a version where all the "x" have been removed.
 * Except an "x" at the very start or end should not be removed.
 *
 *
 * stringX("xxHxix") → "xHix"
 * stringX("abxxxcd") → "abcd"
 * stringX("xabxxxcdx") → "xabcdx"
 */

public class StringX {
    public String stringX(String str) {
        String newString = "";

        if (str.length() < 2) {
            return str;
        }
        //adds the first char to newString irrespective of 'x'
        newString = newString + str.charAt(0);

        // add char to newString that are not 'x'
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                newString = newString + String.valueOf(str.charAt(i));
            }
        }
        //adds the last char to newString irrespective of 'x'
        newString = newString + str.substring(str.length() - 1);

        System.out.println(newString);
        return newString;
    }


}
