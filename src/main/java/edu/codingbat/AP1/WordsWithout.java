package edu.codingbat.AP1;
/*
Given an array of strings, return a new array without the strings that are equal to the target string.


wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
 */

import java.util.Arrays;

public class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {

        int count =0;


        for (int i=0; i<words.length; i++){
            if(words[i].equals(target)){
                count++;
            }

        }
        count = words.length - count;
        System.out.println(count);

        String[] array = new String[count];
        int index =0;
        for(int j=0; j<words.length; j++ ){
            if(!words[j].equals(target)){
                array[index]= words[j];
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }


    public static void main(String[] args) {
        WordsWithout object = new WordsWithout();
        String[] words ={"a", "b", "c", "a"};
        String target = "a";
        object.wordsWithout(words,target);
    }
}
