package edu.codingbat.ap1;

public class ScoresClump {
    public boolean scoresClump(int[] scores) {
        for(int i=0; i<scores.length-2; i++){
            if(scores[i+1]-scores[i]<=2 && scores[i+2]-scores[i]<=2){
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        ScoresClump object = new ScoresClump();
        int[] scores = {3,4,5,5};
        object.scoresClump(scores);
    }

}