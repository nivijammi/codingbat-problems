package edu.codingbat;
/*
* Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".


withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
*/

public class withoutString {


    public String withoutString(String base, String remove) {
        StringBuilder newString = new StringBuilder();
        String string="";
        for(int i=0; i<base.length(); i++) {
            if (base.substring(i, remove.length()) != remove) {
                System.out.println(base.substring(i, remove.length()));
                string = string + base.charAt(i);
            }
        }
        System.out.println(string);
        return string;
    }
    public static void main(String[] args){
        withoutString object = new withoutString();
        object.withoutString("Hello String","llo");
    }
}
