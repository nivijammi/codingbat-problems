package edu.codingbat;

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.


xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 */

public class startswith {

    public boolean xyzThere(String str) {
        //Condition 1: if xyz is found in the beginning
        if (str.length() >= 3 && str.substring(0, 3).equals("xyz")) {
            System.out.println("true");
            return true;
        }
        //condition 2: if i is "x", i-1 should not be ".";
        //condition 3: if you find "x" with no"." at i-1...check i, i+1, i+2 for "xyz"
        for (int i = 1; i < str.length() - 2; i++) {
            if (str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz")) {
                System.out.println("true");
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        startswith sw = new startswith();
        sw.xyzThere("abc.xyzxyz");
    }

}
