package edu.codingbat;

public class betweenTwo {
    public String getSandwich(String str) {
        if(str.length()>10) {
            int indexValue = str.indexOf("bread");

            for (int i = indexValue + 5; i < str.length() - 4; i++) {
                String newString = str.substring(i, str.length());
                System.out.println(newString);
                if (newString.equals("bread")) ;
                int indexValue2 = newString.lastIndexOf("bread");
                System.out.println(indexValue2);
                String inBetween = newString.substring(0, indexValue2);
                System.out.println(inBetween);
                return inBetween;

            }
        }

        return "";
    }
    public static void main (String[]args){
        betweenTwo bt = new betweenTwo();
        bt.getSandwich("xxbreadjambreadyy");
    }

}
