package edu.codingbat.string2;

public class starOut{
    /*
    * Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
*/
    public  String starOut(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') continue;
            System.out.println(i);
            if (i > 0 && s.charAt(i - 1) == '*') continue;
            if (i < s.length() - 1 && s.charAt(i + 1) == '*') continue;

            sb.append(s.charAt(i));
        }
        System.out.println(sb);
        return sb.toString();
    }
    public static void main(String[]args){
        starOut so = new starOut();
        so.starOut("sm*eil*ply");
    }
}