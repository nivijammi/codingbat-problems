package edu.codingbat.AP1;
/*
Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the largest special score in B. To practice decomposition, write a separate helper method which finds the largest special score in an array. Write your helper method after your scoresSpecial() method in the JavaBat text area.


scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
 */

public class ScoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        int SpecialA = Special(a);
        int SpecialB = Special(b);
        int sum = SpecialA + SpecialB;

        System.out.println(sum);
        return sum;
    }
    public int Special(int[] array){
        int num = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]%10==0 && array[i]>num){
                num=array[i];

            }
        }
        return num;
    }

    public static void main(String[] args) {
        ScoresSpecial object = new ScoresSpecial();
        int[] a = {12, 10, 4};
        int[] b = {2, 20, 30};
        object.scoresSpecial(a,b);
    }
}
