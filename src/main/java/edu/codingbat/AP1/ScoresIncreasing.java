package edu.codingbat.AP1;
/*
Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.


scoresIncreasing([1, 3, 4]) → true
scoresIncreasing([1, 3, 2]) → false
scoresIncreasing([1, 1, 4]) → true
 */
public class ScoresIncreasing {
    public boolean scoresIncreasing(int[] scores) {
        boolean isTrue = false;
        for(int i =0; i<scores.length-1; i++){
            if(scores[i]<=scores[i+1]){
                isTrue = true;
            }
            else{
                isTrue = false;
                System.out.println(false);
                return false;
            }
        }
        System.out.println(isTrue);
        return isTrue;
    }

    public static void main(String[] args) {
        ScoresIncreasing object = new ScoresIncreasing();
        int[] scores = {1,1,2,4,3,7};
        object.scoresIncreasing(scores);
    }
}
