package edu.codingbat.string3;

import java.util.Arrays;

public class SameEnds2 {

    public String sameEnds(String string) {
        String[] str = string.split("");
        System.out.println(Arrays.toString(str));
        int index =0;
        String newStr = "";

        for(int i =1; i<str.length;i++){

            String temp = str[index];

            if(temp.equals(str[i])){
                newStr = newStr + temp;
                index++;
            }

        }

        System.out.println(newStr);
        return newStr;
    }


    public static void main(String[] args) {
        SameEnds2 object = new SameEnds2();
        object.sameEnds("javaXYZjaXjava");
    }

}
