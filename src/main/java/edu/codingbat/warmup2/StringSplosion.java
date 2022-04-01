package edu.codingbat.warmup2;

/**
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 * * stringSplosion("Code") → "CCoCodCode"
 * stringSplosion("abc") → "aababc"
 * stringSplosion("ab") → "aab"
 */

public class StringSplosion {
    public String stringSplosion(String str) {
        String temp = "";
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            temp = temp + str.charAt(i);
            newString = newString + temp ;

        }
        System.out.println(newString);
        return newString;
    }
}
