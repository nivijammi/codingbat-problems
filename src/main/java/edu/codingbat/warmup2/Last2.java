package edu.codingbat.warmup2;

public class Last2 {
    public int last2(String str) {
        int temp =0;
        for(int i=0;i<str.length()-2;i++) {
            String sub = str.substring(i, i+2);
            String end = str.substring(str.length()-2);
            if (sub.equals(end)) {
                temp = temp+1;
                System.out.println(temp);

            }

        }
        return temp;


    }
    public static void main(String [] args){
        Last2 object = new Last2();
        object.last2("hixxhi");
        object.last2("xaxxaxaxx");

    }



}
