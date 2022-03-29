package edu.codingbat.warmup1;
/**
 *
 Given a string, return a new string where the first and last chars have been exchanged.


 frontBack("code") → "eodc"
 frontBack("a") → "a"
 frontBack("ab") → "ba"


 */

public class FrontBack {
    public String frontBack(String str) {
        if (str.length()<= 1) {
            System.out.println(str);
            return str;
        }
        String a = str.substring(1,str.length()-1);
        String newString = str.charAt(str.length()-1) + a + str.charAt(0);
        System.out.println(newString);
        return newString;

    }


}
