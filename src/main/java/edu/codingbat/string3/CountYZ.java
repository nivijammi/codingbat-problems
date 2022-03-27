package edu.codingbat.string3;
/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
 */
public class CountYZ {
    public int countYZ(String str) {
        str = str.toLowerCase();
        int c=0;
        for(int i=0; i<str.length()-1; i++){
            if((str.charAt(i)=='y' || str.charAt(i)=='z') && !Character.isLetter(str.charAt(i+1)))
                c++;
        }
        if(str.charAt(str.length()-1)=='y' || str.charAt(str.length()-1)=='z')
            c++;
        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
        CountYZ object = new CountYZ();
        object.countYZ("day fyyyz");
    }
}
