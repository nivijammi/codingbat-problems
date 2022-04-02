package edu.codingbat.warmup2;

/**
 * Given a string, return the count of the number of times that a substring
 * length 2 appears in the string and also as the last 2 chars of the string,
 * so "hixxxhi" yields 1 (we won't count the end substring).
 *
 * last2("hixxhi") → 1
 * last2("xaxxaxaxx") → 1
 * last2("axxxaaxx") → 2
 */

public class Last2 {
    public int last2(String str) {
        String subStrI = "";
        String endSubStr = "";
        int count = 0;

        if (str.length()> 2) {
            endSubStr = str.substring(str.length()-2);
            for (int i = 0; i < str.length() - 2; i++) {
                subStrI = str.substring(i,i+2);
                System.out.println("subStrI: " + " " + subStrI);
                if(subStrI.equals(endSubStr)){
                    count++;
                }

            }
        }
        System.out.println(count);
        return count;
    }


}
