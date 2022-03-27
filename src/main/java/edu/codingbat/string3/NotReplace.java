package edu.codingbat.string3;

/* Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)


notReplace("is test")	"is not test"
notReplace("is-is")	"is not-is not"
notReplace("This is right")	"This is not right"
notReplace("This is isabell")	"This is not isabell"
notReplace("")	""
notReplace("is")	"is not"
notReplace("isis")	"isis"
notReplace("Dis is bliss is")	"Dis is not bliss is not"
notReplace("is his")	"is not his"
notReplace("xis yis")	"xis yis"
notReplace("AAAis is")	"AAAis is not"
  */

public class NotReplace {

    public String notReplace(String str) {
        StringBuilder strWithNot = new StringBuilder();
        String wordToCompare ="";
        String is = "is";
        String isNot = "is not";
        String string = str + " ";

        if(str.equals(is)){
            return isNot;
        }

        for(int i=0; i<string.length();i++) {
            if (Character.isLetter(string.charAt(i))) {
                wordToCompare = wordToCompare + string.charAt(i);
            }
            else{

                if(wordToCompare.equals(is)) {

                    strWithNot.append(isNot);

                    if (i != endOfString(string)) {
                        strWithNot.append(string.charAt(i));
                        wordToCompare = "";
                    }
                    else{
                        wordToCompare = "";
                    }

                }

                else{
                    if(i!=endOfString(string)){
                        strWithNot.append(wordToCompare + string.charAt(i));
                        wordToCompare = "";
                    }
                    else{
                        strWithNot.append(wordToCompare);

                    }
                }
            }
        }
        System.out.println(strWithNot);
        return String.valueOf(strWithNot);
    }

    private int endOfString(String string) {
        return string.length()-1;
    }

    public static void main(String[] args) {
        NotReplace object = new NotReplace();
        object.notReplace("is");
    }

}
