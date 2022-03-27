package edu.codingbat.warmup2;

public class stringSplosion {
    public String stringSplosion(String str){
        String temp= "";
        for (int i = 0; i<str.length(); i++){
            temp = temp + str.substring(0,i+1);

        }

        return temp;
    }
    /*
    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
     */

    public void teststringSplosion(){
        String result1 = stringSplosion("Code");
        System.out.println("result1 : "+result1 );

        String result2 = stringSplosion("abc");
        System.out.println("result2 : "+result2 );

        String result3 = stringSplosion("ab");
        System.out.println("result3 : "+result3 );

    }
    public static void main(String args[]){
        stringSplosion ss = new stringSplosion();
        ss.teststringSplosion();
    }



}
