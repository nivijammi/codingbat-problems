package edu.codingbat;
/*Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().


prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false

* */
public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String word = "";
        String currentWord = "";
        word = str.substring(0,n);
        currentWord = str.substring(n,str.length());
        System.out.println(currentWord);

            if(currentWord.contains(word)){
                System.out.println("true");
                return true;
            }



        System.out.println("false");
        return false;
    }
    public static void main(String[]args){
        PrefixAgain pa = new PrefixAgain();
        pa.prefixAgain("abXYabs",2);

    }

}
