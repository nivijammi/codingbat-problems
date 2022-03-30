package edu.codingbat.warmup1;
/**
 * Given a string, return true if the string starts with "hi" and false otherwise.
 *
 *
 * startHi("hi there") → true
 * startHi("hi") → true
 * startHi("hello hi") → false

 */

public class StartHi {
    public boolean startHi(String str) {
        if (str.length()<2){
            System.out.println("false");
            return false;
        }

        if (str.startsWith("hi")){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }
}
