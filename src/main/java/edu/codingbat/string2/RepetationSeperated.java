
package edu.codingbat;

public class RepetationSeperated {
    /*
        *Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.


    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    repeatSeparator("This", "And", 2) → "ThisAndThis"
    repeatSeparator("This", "And", 1) → "This"
 */
    public String repeatSeparator(String word, String sep, int count) {
        String newWord ="";
        if (count>0){
            for(int i=0; i<count-1;i++){
                newWord = newWord + word +sep;
            }
        }
        if (count==0){
            System.out.println("Nothing");
            return "Nothing";
        }
        System.out.println(newWord + word);
        return newWord = newWord + word;
    }
    public static void main(String[]args){
        RepetationSeperated repeat = new RepetationSeperated();
        //repeat.repeatSeparator("This", "and", 3);
        repeat.repeatSeparator("AAA", "", 0);

    }
}
