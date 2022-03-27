package edu.codingbat.string2;
/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.


wordEnds("abcXY123XYijk", "XY")	"c13i"
wordEnds("XY123XY", "XY")	"13"
wordEnds("XY1XY", "XY")	"11"
wordEnds("XYXY", "XY")	"XY"
wordEnds("XY", "XY")	""
wordEnds("Hi", "XY")	""
wordEnds("", "XY")	""
wordEnds("abc1xyz1i1j", "1")	"cxziij"
wordEnds("abc1xyz1", "1")	"cxz"
wordEnds("abc1xyz11", "1")	"cxz11"
wordEnds("abc1xyz1abc", "abc")	"11"
wordEnds("abc1xyz1abc", "b")	"acac"
wordEnds("abc1abc1abc", "abc")	"1111"
 */
public class WordsEnd {
    public String wordEnds(String str, String word) {


        StringBuilder newWord = new StringBuilder();
        int lenDiff = str.length()-word.length();

        // cases where there is no need to extract chars.
        if(word.equals(str)){
            return String.valueOf(newWord);
        }

        for(int i=0; i<lenDiff+1;i++){ //+1 will prove helpful when str ends with word

            // edge case 1: when str starts with word- collect only the char after word
            if(i==0 && str.substring(i,i+word.length()).equals(word)){
                newWord.append(str.charAt(word.length()));
                i++;// to exit from the current loop
            }
            //edge case 2: when str ends with word- collect only the previous char
            if(i==lenDiff && str.substring(i,i+word.length()).equals(word)){
                newWord.append(str.charAt(lenDiff-1));
            }

            // best case: get to collect both previous and latter chars.
            else if(str.substring(i,i+word.length()).equals(word)){
                newWord.append(str.charAt(i-1));
                newWord.append(str.charAt(i+word.length()));
            }

        }
        System.out.println(newWord);
        return String.valueOf(newWord);
    }

    public static void main(String[] args) {
        WordsEnd object = new WordsEnd();
        object.wordEnds("abc1xyz1abc", "abc");
    }
}

