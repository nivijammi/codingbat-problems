package edu.codingbat.warmup2;

public class stringMatch {
    public int stringMatch(String a, String b) {

        int pos =0;
        int len = Math.min(a.length(), b.length());
        for(int i =0; i<len-1;i++) {
            String subA = a.substring(i,i+2);
            String subB = b.substring(i,i+2);
            if (subA.equals(subB)){
                pos= pos+1;
                System.out.println("subA  "+ subA + "  " +"subB  " + subB);
            }
        }
        System.out.println(pos );
        return pos;
    }


    public static void main(String args[]) {
        stringMatch object = new stringMatch();
        object.stringMatch("abc", "abc");
        object.stringMatch("", "hello");



    }

}