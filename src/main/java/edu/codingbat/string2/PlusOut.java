package edu.codingbat.string2;
/*
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy")	"++xy++"
plusOut("12xy34", "1")	"1+++++"
plusOut("12xy34xyabcxy", "xy")	"++xy++xy+++xy"//
plusOut("abXYabcXYZ", "ab")	"ab++ab++++"
plusOut("abXYabcXYZ", "abc")	"++++abc+++"
plusOut("abXYabcXYZ", "XY")	"++XY+++XY+"
plusOut("abXYxyzXYZ", "XYZ")	"+++++++XYZ"//
plusOut("--++ab", "++")	"++++++"
plusOut("aaxxxxbb", "xx")	"++xxxx++"
plusOut("123123", "3")	"++3++3"//
 */

/*
we are making use of the startwith function but instead we are removing
 */
public class PlusOut {

    public String plusOut(String str, String word) {
        String plus = "";

        String newStr = "";

        while (str.length()>=word.length()){
            String sub =str.substring(0,word.length());
            //System.out.println(sub);
            if(!str.substring(0,word.length()).equals(word)){

                newStr+= "+";
                str = str.substring(1);
                //System.out.println(str);
            }
            else{
                newStr += word;
                str = str.substring(word.length());
            }
        }

        for(int i = 0; i < str.length(); i++)
            newStr+= "+";

        System.out.println(newStr);
        return newStr;
    }


    public static void main(String[] args) {
        PlusOut object = new PlusOut();
        object.plusOut("12xy34xyabcxy", "xy");
    }
}
