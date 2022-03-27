package edu.codingbat.string3;
/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).


equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true

 */

public class EqualIsNot {
    public boolean equalIsNot(String str){
        int isCount =0;
        int isNotCount =0;

        for(int i=0;i<str.length(); i++) {

            if (i< str.length()-1 && str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                isCount = isCount + 1;
                System.out.println("isCount: " + isCount);
            }
            else if ((i < str.length()-2) && str.charAt(i) == 'n' && str.charAt(i + 2) == 't') {
                    isNotCount = isNotCount + 1;
                    System.out.println("isNotCount: " + isNotCount);
                }
            }


        if(isCount==isNotCount){
            System.out.println("true");
            return true;
            }

        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        EqualIsNot object = new EqualIsNot();
        object.equalIsNot("isisnotno7Not");
    }
}

