package edu.codingbat.warmup1;
/**
 * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
 *
 *
 * front22("kitten") → "kikittenki"
 * front22("Ha") → "HaHaHa"
 * front22("abc") → "ababcab"

 */

public class front22 {
    public String front22(String str) {
        if (str.length()>2){
            String front = str.substring(0,2);
            String newString = front+str+front;
            System.out.println(newString);
            return newString;
        }
        else{
            String updatedString = str+str+str;
            return updatedString;
        }
    }

}
