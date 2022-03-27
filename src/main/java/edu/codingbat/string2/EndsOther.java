package edu.codingbat.string2;

public class EndsOther {
    public boolean endOther(String a, String b) {
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        if (A.length() > B.length()) {
            int Alen = A.length() - B.length();
            String newA = A.substring(Alen, A.length());
            System.out.println(newA);
            if (newA.equals(B)) {
                System.out.println("true");
                return true;
            }
        }
        else if (B.length() > A.length()) {
            int Blen = B.length() - A.length();
            String newB = B.substring(Blen, B.length());
            System.out.println(newB);
            if (newB.equals(A)) {

                System.out.println("true");
                return true;
            }
        }
        else {
            System.out.println("false");
            return false;
        }


        return false;
    }

    public static void main(String[] args) {
        EndsOther other = new EndsOther();
        other.endOther("Hiabc", "abc");

    }
}
