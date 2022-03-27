package edu.codingbat.AP1;

/*
Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.


scores100([1, 100, 100]) → true
scores100([1, 100, 99, 100]) → false
scores100([100, 1, 100, 100]) → true
 */
public class Scores100 {
    public boolean scores100(int[] scores) {
        boolean is100 = false;
        for(int i =0; i<scores.length-1;i++){
            if(scores[i]==100 && scores[i+1]==100){
                is100 = true;
            }

        }
        System.out.println(is100);
        return is100;
    }

    public static void main(String[] args) {
        Scores100 object = new Scores100();
        int[]scores = {1,100,100};
        object.scores100(scores);

    }


}
