package edu.codingbat.string3;
/*
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".


withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"

 */

public class WithoutString {
    public String withoutString(String base, String remove){
        String newbase = "";
        int i =0;

        while(i<=base.length()-remove.length()) {

            if (base.substring(i, i+remove.length()).equalsIgnoreCase(remove)){

                i=i+ remove.length();


            } else {
                newbase = newbase + base.charAt(i);
                i++;
            }
        }
        newbase = newbase +base.substring(i);

        System.out.println(newbase);
        return newbase;
    }


    public static void main(String[] args) {
        WithoutString object = new WithoutString();
        object. withoutString("This is a FISH", "IS");
    }
}
