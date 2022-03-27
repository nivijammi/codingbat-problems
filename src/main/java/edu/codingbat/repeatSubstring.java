package edu.codingbat;
/*
* Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.


repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
*/

public class repeatSubstring {
    public String repeatEnd(String str, int n) {
        String strToReturn = "";
        int strLength = str.length();
        int startIndex = strLength-n;
        String substring = str.substring(startIndex, strLength);
        for(int counter=0; counter < n; counter++) {
            strToReturn = strToReturn + substring;


        }
        System.out.println(strToReturn);
        return strToReturn;

    }
    public static void main(String[]args){
        repeatSubstring repeatSubstring = new repeatSubstring();
        repeatSubstring.repeatEnd("Hello", 3);
    }

}
