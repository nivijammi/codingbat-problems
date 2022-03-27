package edu.codingbat;

public class plusOut {
    /*
    Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.


    plusOut("12xy34", "xy") → "++xy++"
    plusOut("12xy34", "1") → "1+++++"
    plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
     */

    public String plusOutplus(String str, String word) {
        StringBuilder newString = new StringBuilder(str);

        //find substrings to edit,from index i(including)
        //to index j excluding
        for (int i = 0; i < str.length(); i+=word.length()) {
            int j = newString.indexOf(word, i);
            if(j<0){
                //word not found,edit the rest of the string
                j= newString.length();
            }

            while(i<j){
                newString.setCharAt(i++,'+');
            }
        }


            System.out.println(newString);
            return String.valueOf(newString);
        }






    public static void main(String[]args){
        plusOut replace = new plusOut();
        replace.plusOutplus("12xy34","xy");
    }
}
