package edu.codingbat.warmup1;
/**
 * Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
 *
 *
 * endUp("Hello") → "HeLLO"
 * endUp("hi there") → "hi thERE"
 * endUp("hi") → "HI"
 */

public class EndUp {
    public String endUp(String str) {
        int length = str.length();
        if(length < 3){
            String upDatedStr = str.toUpperCase();
            System.out.println(upDatedStr);
            return upDatedStr;

        }
        int lastThree = str.length() -3;
        String front = str.substring(0,lastThree);
        String back = str.substring(lastThree);
        String newString =front+back.toUpperCase();
        System.out.println(newString);
        return newString;
    }

}
