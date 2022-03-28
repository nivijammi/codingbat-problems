package edu.codingbat.warmup1;

public class Diff21 {
    public int diff21(int n) {

        if(n<=21){
            System.out.println(21-n);
            return 21-n;
        }
        System.out.println((n-21)*2);
        return (n-21)*2;
    }
}
