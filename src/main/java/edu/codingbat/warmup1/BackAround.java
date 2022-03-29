package edu.codingbat.warmup1;

/**
 * Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
 *
 *
 * backAround("cat") → "tcatt"
 * backAround("Hello") → "oHelloo"
 * backAround("a") → "aaa"
 */
public class BackAround {
    public String backAround(String str) {
        String front = str.substring(str.length()-1);
        String newString = front+str+front;
        System.out.println(newString);
        return newString;
    }
}
