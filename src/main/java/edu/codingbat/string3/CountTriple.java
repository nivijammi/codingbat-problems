package edu.codingbat.string3;
/*
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.


countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
 */

public class CountTriple {
    public int countTriple(String str){
        int len = str.length();
        int j=1;
        int count=0;
        for(int i =0; i<len-2; i++,j++){
            if(str.charAt(i)==str.charAt(i+2)&& str.charAt(i)==str.charAt(j)){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        CountTriple object = new CountTriple();
        object.countTriple("a");
    }


}
