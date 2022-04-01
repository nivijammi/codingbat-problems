package edu.codingbat.warmup2;

/**
 * Given a string, return true if the first instance of "x" in the string
 * is immediately followed by another "x".
 *
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 */
public class DoubleX {

    public boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x'){
                if(str.charAt(i + 1) == 'x') {
                    System.out.println("true");
                    return true;
                } else {
                    System.out.println("false");
                    return false;
                }
            }

        }
        System.out.println("false");
        return false;
    }

}



