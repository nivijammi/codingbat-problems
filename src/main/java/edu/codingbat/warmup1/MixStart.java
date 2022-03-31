package edu.codingbat.warmup1;
/**
 Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

 mixStart("mix snacks") → true
 mixStart("pix snacks") → true
 mixStart("piz snacks") → false
 */

public class MixStart {
    public boolean mixStart(String str) {
        if(str.length()>=3 && str.substring(1,3).equals("ix")){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }


    }

}
