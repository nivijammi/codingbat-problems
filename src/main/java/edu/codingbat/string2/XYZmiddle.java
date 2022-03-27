package edu.codingbat;

public class middleWord {
    public boolean xyzMiddle(String str) {
        int mid = str.length() / 2;

        if (str.length() < 3) {
            System.out.println("false");
            return false;
        }

        if (str.length() % 2 == 0) {
            mid = str.length() / 2;
            String evenSubstring = str.substring(mid - 1, (mid - 1) + 3);
            String evenSubstring2 = str.substring(mid - 2, (mid - 2) + 3);
            if (evenSubstring.equals("xyz") || evenSubstring2.equals("xyz")) {
                System.out.println("true");
                return true;

            }
        }

        if (str.length() % 2 != 0) {
            mid = str.length() / 2;
            String oddSubstring = str.substring(mid - 1, (mid - 1) + 3);
            if (oddSubstring.equals("xyz")) {
                System.out.println("true");
                return true;

            }
        }

        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        middleWord mW = new middleWord();
        mW.xyzMiddle("xyz");
    }
}
