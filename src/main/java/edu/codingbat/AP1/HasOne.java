package edu.codingbat.AP1;
/*
Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

hasOne(10)	true
hasOne(22)	false
hasOne(220)	false
hasOne(212)	true
hasOne(1)	true
hasOne(9)	false
hasOne(211112)	true
hasOne(121121)	true
hasOne(222222)	false
hasOne(56156)	true
hasOne(56556)	false


 */

public class HasOne {
    public boolean hasOne(int n) {
        int q= n/10;
        if(q<=10 && q==1){
            return true;
        }
        while (q > 10) {

            if (q % 10 == 1) {
                System.out.println("true");
                return true;

            }
            else{
                q=q/10;
            }
        }
        System.out.println("false");
        return false;
    }




    public static void main(String[] args) {
        HasOne object = new HasOne();
        object.hasOne(121121);

    }


}
