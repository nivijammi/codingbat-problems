package edu.codingbat.string2;
/*
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.


plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */
public class NewPlusOut {

    public String plusOut(String str, String word){

        String newString = str + word;// to avoid IOB exception
        String plusWord = "";
        int i=0;

        while(i<newString.length()-word.length()){
            if(!newString.substring(i,i+word.length()).equals(word)){
                plusWord= plusWord + '+';
                newString = newString.substring(1);


            }
            else{
                plusWord = plusWord + word;
                newString = newString.substring(i+word.length());


            }
        }

        System.out.println("final answer: "+plusWord);
        return plusWord;
    }
    public static void main(String[] args) {
        NewPlusOut object = new NewPlusOut();
        object.plusOut("12xy34xyabcxy", "abc");
    }
}
