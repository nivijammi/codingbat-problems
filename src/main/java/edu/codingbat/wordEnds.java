package edu.codingbat;

public class wordEnds {
    /*
    * Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string.
    * Ignore cases where there is no char before or after the word,
     * and a char may be included twice if it is between two words.


wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"


*/

    public String wordEnds(String str, String word) {
        StringBuilder s = new StringBuilder();


        if(str.contains("XY") && str.charAt(0)=='X' ){
            s.append(str.charAt(2));
            System.out.println(str.charAt(str.length()));
        }
        /*if(str.contains("XY") && str.charAt(str.length())=='Y' ){
            System.out.println(str.charAt(str.length()));
            //s.append(str.charAt(str.length()-2));
        }
        */

        for(int i=1; i<str.length(); i++){

            if (str.charAt(i) == 'X' && str.charAt(i + 1) == 'Y' ) {
                s.append(str.charAt(i - 1));
                s.append(str.charAt(i + 2));
            }

        }

        System.out.println(s);
        return str;
    }
    public static void main(String[]args){
        wordEnds object = new wordEnds();
        object.wordEnds("XY1234XY1", "XY");
    }

}
