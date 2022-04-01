package edu.codingbat.warmup2;

/**
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

 * stringBits("Hello") → "Hlo"
 * stringBits("Hi") → "H"
 * stringBits("Heeololeo") → "Hello"
 */

public class StringBits {
    public String stringBits(String str){
        String newString = "";
        for(int i=0; i<str.length();i+=2){
            newString = newString + str.charAt(i);
        }
        System.out.println(newString);
        return newString;
    }
}





