package edu.codingbat.string3;
/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18

 */

public class SumNumbers {
    public int sumNumbers(String str) {
        String StrDigits = "";
        boolean encounteredDigits = false;
        int digit = 0;
        int sum =0;
        String string = str + "a";

        for(int i=0; i<=str.length();i++){


            if(Character.isDigit(string.charAt(i))){
                encounteredDigits = true;
                StrDigits = StrDigits + string.charAt(i);
                digit = Integer.parseInt(StrDigits);
            }
            else{

                if (encounteredDigits) {
                    sum = sum + digit;
                    StrDigits = "";
                    encounteredDigits = false;



                }
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        SumNumbers object = new SumNumbers();
        object.sumNumbers("7 11");
    }
}
