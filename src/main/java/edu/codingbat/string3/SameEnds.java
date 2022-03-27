package edu.codingbat.string3;

/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"

 */

public class SameEnds {
    public String sameEnds(String string){
        for(int i =0; i<string.length();i++){
            for(int j=1;j<string.length();j++){
                if(string.charAt(i)==string.charAt(j)){
                    //if(string.charAt(i+1)==string.charAt(j+1);

                }


            }
        }

        return string;
    }

    public static void main(String[] args) {
        SameEnds object = new SameEnds();
        object.sameEnds("abXYab");
    }

}
