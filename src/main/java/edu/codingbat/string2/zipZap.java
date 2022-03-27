package edu.codingbat.string2;

public class zipZap {
    /*
        * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


    zipZap("zipXzap") → "zpXzp"
    zipZap("zopzop") → "zpzp"
    zipZap("zzzopzop") → "zzzpzp"
*/
    public String zipZapMiddle(String str){


            for(int i=0; i<str.length()-2; i++) {
                if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                    str = str.substring(0, i+1) + str.substring(i+2);
                    System.out.println(str);

                }
            }



        return str;
    }
    public static void main(String[]args){
        zipZap zz = new zipZap();
        zz.zipZapMiddle("zzzopzop");
    }


}
