package edu.codingbat.AP1;
/*
We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.


dividesSelf(128) → true
dividesSelf(12) → true
dividesSelf(120) → false
 */
public class DividesSelf {
    public boolean dividesSelf(int n) {
        int remainder = n % 10;
        int divide = n / 10;
        while (divide >= 10) {
            divide = divide / 10;

        }
        if (remainder != 0) {
            if (n % remainder == 0 && n % divide == 0) {
                System.out.println("true");
                return true;
            }
        }

        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
       DividesSelf object = new DividesSelf();
       object.dividesSelf(120);
    }
}