package edu.codingbat.string2;

public class DoubleChar {

    public String doubleChar(String str) {
        String stringToReturn ="";
        for(int i=0;i<str.length(); i++){
            stringToReturn = stringToReturn + str.charAt(i) + str.charAt(i);

        }
        //System.out.println(stringToReturn);

        return stringToReturn;
    }
    public static void main(String[]args){
        DoubleChar ch = new DoubleChar();
        String returnValue = ch.doubleChar("Hi-There");
        System.out.println("Double Char returned of each char in the String: " + returnValue);

    }

}
