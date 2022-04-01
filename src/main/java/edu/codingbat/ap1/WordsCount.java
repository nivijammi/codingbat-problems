package edu.codingbat.ap1;
/*
Given an array of strings, return the count of the number of strings with the given length.


wordsCount(["a", "bb", "b", "ccc"], 1) → 2
wordsCount(["a", "bb", "b", "ccc"], 3) → 1
wordsCount(["a", "bb", "b", "ccc"], 4) → 0

 */

public class WordsCount {
    public int wordsCount(String[] words, int len) {
        int Count =0;

        for(String word: words){
            int Len = word.length();

            if(Len == len){
                Count = Count + 1;
            }

        }
        System.out.println(Count);
        return Count;
    }

    public static void main(String[] args) {
        WordsCount object = new WordsCount();
        String[] words = {"a", "bb", "b", "ccc"};
        int len = 1;
        object.wordsCount(words, len);
    }


}
