package edu.codingbat.string2;

public class NewPlusOut2 {
    public String plusOut(String str, String word) {

        String str2 = str + word;//to avoid IOB exception
        String wordWithPlus = "";

        for (int i = 0; i <str2.length()-word.length(); i++) {
            if(!str2.substring(i,i+word.length()).equals(word)){
                wordWithPlus = wordWithPlus + "+";

            }
            else {
                wordWithPlus = wordWithPlus + word;
                i= i+ word.length()-1;//increase index by word length including i
            }

        }

        System.out.println(wordWithPlus);
        return wordWithPlus;
    }
    public static void main(String[] args) {
        NewPlusOut2 object = new NewPlusOut2();
        object.plusOut("123123", "3");
    }
}
