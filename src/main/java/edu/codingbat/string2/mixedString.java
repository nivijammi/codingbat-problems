package edu.codingbat.string2;

public class mixedString {
    public String mixString(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int min = Math.min(aLen, bLen);
        String newString = "";
        String mix ="";

        for (int i = 0; i < min; i++) {

            newString = newString + a.charAt(i) + b.charAt(i);
            System.out.println(newString);
        }
        System.out.println(b.substring(min));
        mix = newString + b.substring(min) + a.substring(min);

        System.out.println(mix);
        return mix;
    }


    public static void main(String[] args) {
        mixedString ms = new mixedString();
        ms.mixString("abc", "xyzmno");
    }

}
