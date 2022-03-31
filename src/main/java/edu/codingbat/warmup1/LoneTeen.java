package edu.codingbat.warmup1;
/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
 *
 *
 * loneTeen(13, 99) → true
 * loneTeen(21, 19) → true
 * loneTeen(13, 13) → false

 */

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean x = (a>=13 && a<=19);
        boolean y = (b>=13 && b<=19);
        if( (x && !y) || (!x && y) ){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }
}
