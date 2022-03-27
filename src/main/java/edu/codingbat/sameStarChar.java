package edu.codingbat;

public class sameStarChar {
    /*Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.


    sameStarChar("xy*yzz") → true
    sameStarChar("xy*zzz") → false
    sameStarChar("*xa*az") → true

     */
    public boolean starCharSame(String str){

        for(int i=1; i<str.length()-1;i++){
            System.out.println(str.charAt(i));
            if(str.charAt(i)=='*'){

                System.out.println(i);



                if(str.charAt(i-1)!=str.charAt(i+1)){
                    System.out.println("false");
                    return false;
                }

            }
        }
        System.out.println("true");
        return true;
    }


    public static void main(String[]args){
        sameStarChar SS = new sameStarChar();
        SS.starCharSame("12*2*3" );
    }

}
