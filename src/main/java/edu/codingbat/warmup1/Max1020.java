package edu.codingbat.warmup1;

/**
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
 *
 *
 * max1020(11, 19) → 19
 * max1020(19, 11) → 19
 * max1020(11, 9) → 11
 */

public class Max1020 {
    public int max1020(int a, int b) {
        if ((a>=10 && a<=20) && (b>=10 && b<=20)){
            if (a>b){
                System.out.println(a);
                return a;
            }
            else if (b>a){
                System.out.println(b);
                return b;
            }
        }
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            if (a>=10 && a<=20){
                return a;
            }
            else if (b>=10 && b<=20){
                System.out.println(b);
                return b;
            }
            else{
                System.out.println(0);
                return 0;
            }
        }
        else{
            System.out.println(0);
            return 0;
        }


    }
}
