package edu.codingbat.string3;
/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".


mirrorEnds("abXYZba")	"ab"
mirrorEnds("abca")	"a"
mirrorEnds("aba")	"aba"
mirrorEnds("abab")	""
mirrorEnds("xxx")	"x"
mirrorEnds("xxYxx")	"xx"
mirrorEnds("Hi and iH")	"Hi "
mirrorEnds("x")	""
mirrorEnds("")	""
mirrorEnds("123and then 321")	"123n"
mirrorEnds("band andab")	"ba"

 */
public class MirrorEnds {
    public String mirrorEnds(String string) {
        String word = "";
        int j = string.length()- 1;
        int mid = string.length()/2;
        boolean isfound= true;

        for(int i=0; i<string.length();i++,j--) {

                 if(isfound==true) {
                     if (string.charAt(i) == string.charAt(j)) {

                         word = word + string.charAt(i);
                         isfound = true;
                     }
                     else{
                         isfound = false;
                     }
                 }


            }


        System.out.println(word);
        return word;
    }

    public static void main(String[] args) {
        MirrorEnds object = new MirrorEnds();
        object.mirrorEnds("123and then 321");
    }
}
