package edu.codingbat.string3;
/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".


mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */

public class MirrorEnds2 {
    public String mirrorEnds(String string) {
        String mirrorWord = "";
        int j =0;

        for (int i = string.length()-1; i>=0; i--) {
           mirrorWord = mirrorWord + string.charAt(i);
            if(string.charAt(j)== mirrorWord.charAt(i)){
                
            }

        }
        System.out.println(mirrorWord);
        return mirrorWord;
    }

    public static void main(String[] args) {
        MirrorEnds2 object = new MirrorEnds2();
        object.mirrorEnds("abXYZba");
    }
}
