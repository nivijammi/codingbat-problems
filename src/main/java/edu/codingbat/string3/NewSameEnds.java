package edu.codingbat.string3;
/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab")	"ab"
sameEnds("xx")	"x"
sameEnds("xxx")	"x"
sameEnds("xxxx")	"xx"
sameEnds("javaXYZjava")	"java"
sameEnds("javajava")	"java"
sameEnds("xavaXYZjava")	""
sameEnds("Hello! and Hello!")	"Hello!"
sameEnds("x")	""
sameEnds("")	""
sameEnds("abcb")	""
sameEnds("mymmy")	"my"


 */
public class NewSameEnds {
    public String sameEnds(String string) {
        int len = string.length();
        int divide = len/2;
        String newStr = "";


        for (int i = 0; i <= divide; i++) {
            for (int j = divide; j < len; j++) {
                if (string.substring(0, i).equals(string.substring(j, len))) {
                    newStr = string.substring(0, i);
                }
            }
        }

        System.out.println(newStr);
        return newStr;
    }


    public static void main(String[] args) {
        NewSameEnds object = new NewSameEnds();
        object.sameEnds("javaXYjaZjava");
    }

}
