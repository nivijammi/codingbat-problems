package edu.codingbat.string2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String strToRepeat = "";

        for(int counter=n; n>0; n--){

            strToRepeat=strToRepeat+str.substring(0,n);

        }
        System.out.println(strToRepeat);
        return strToRepeat;
    }
    public static void main(String[]args){
        RepeatFront repeat= new RepeatFront();
        repeat.repeatFront("Chocolate",4);
        repeat.repeatFront("mobile" , 3);
    }

}
