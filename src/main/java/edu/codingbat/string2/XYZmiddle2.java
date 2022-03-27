package edu.codingbat;

public class XYZmiddle2 {
    public boolean xyzMiddle(String str) {
        if(str.length()<3){
            return false;
        }
        int frontValue=0;
        int backValue=0;
        int diff=0;
        for(int i=0; i<str.length()-3;i++){
            for(int j= str.length();i>=0;i--){
                if(str.substring(i,i+3).equals("xyz") && str.substring(j,j-3).equals("xyz"));
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[]args){
        XYZmiddle2 mW2 = new XYZmiddle2();


    }
}
