package edu.codingbat.string2;

/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.


wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */

public class WordEnds2 {
    public String wordEnds(String str, String word)
    {
        String newWord="";
        if(word.equals(str)){
            return newWord;
        }

        if(str.startsWith(word)) {
            newWord=newWord+str.charAt(word.length());
            System.out.println("when str starts with WORD: " + newWord);
        }

        for (int i=1;i<(str.length()-word.length()); i++){

            if(str.substring(i).startsWith(word)) {
                System.out.println("str.substring(i) is: "+ str.substring(i));
                newWord=newWord+str.charAt(i-1)+str.charAt(i+word.length());

                i=i+word.length();
            }

        }

        if(str.endsWith(word)){
            newWord=newWord+str.charAt(str.length()-word.length()-1);
            System.out.println("when str ends with given word: " + newWord);
        }

        System.out.println(newWord);
        return newWord;
    }
    public static void main(String[] args) {
        WordEnds2 object = new WordEnds2();
        object.wordEnds("abc1abc1abc", "abc");
    }



}
