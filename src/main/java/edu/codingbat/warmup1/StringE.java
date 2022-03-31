package edu.codingbat.warmup1;

/**
 * Return true if the given string contains between 1 and 3 'e' chars.
 *
 *
 * stringE("Hello") → true
 * stringE("Heelle") → true
 * stringE("Heelele") → false
 */

public class StringE {
    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }

        }
        if (count >= 1 && count <= 3) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
