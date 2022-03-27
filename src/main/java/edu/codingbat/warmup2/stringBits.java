package edu.codingbat.warmup2;

public class stringBits {
    public String stringBits(String str){
        String temp="";
        for (int i = 0;i<str.length(); i=i+2){
            temp = temp + str.substring(i,i+1);

        }
        return temp;
    }
    /*
        stringBits("Hello") → "Hlo"
        stringBits("Hi") → "H"
        stringBits("Heeololeo") → "Hello"
    */
    public void testcountXX(){
        String result1 = stringBits("Hello");
        System.out.println("result1 : "+result1 );

        String result2 = stringBits("Hi");
        System.out.println("result2 : "+result2 );

        String result3 = stringBits("Heeololeo");
        System.out.println("result3 : "+result3 );


    }


    public static void main(String args[]){
        stringBits cx = new stringBits();
        cx.testcountXX();
    }


}


