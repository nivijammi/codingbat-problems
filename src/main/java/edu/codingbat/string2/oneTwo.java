package edu.codingbat.string2;
/*
    Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.


    oneTwo("abc") → "bca"
    oneTwo("tca") → "cat"
    oneTwo("tcagdo") → "catdog"
 */

public class oneTwo{
    public String oneTwoOne(String str) {
        String string = "";
        for(int i = 0; i < str.length() - 2; i+=3) {
            string += str.substring(i+1, i+3) + str.charAt(i);
        }
        System.out.println(string);
        return string;
    }

    public static void main (String[]args){
        oneTwo oT = new oneTwo();
        oT.oneTwoOne("tcagdo");
    }

}
