package edu.codingbat.warmup2;

public class AltPairs {
    public String altPairs(String str) {
        String result = "";
        //iterate through the char of the string
        //add to the empty String first two,remove two, then add two till the length
        if (str.length() >= 2) {
            for (int i = 0; i < str.length(); i += 4) {
                // Append the chars between i and i+2
                int end = i + 2;
                if (end > str.length()) {
                    end = str.length();
                }
                result = result + str.substring(i, end);
                
            }
            

        }
        return result;
    }

    public static void main(String[]args){
        AltPairs object= new AltPairs();
        object.altPairs("kitten");
        object.altPairs("chocolate");
        object.altPairs("codingHorror");

    }

}
