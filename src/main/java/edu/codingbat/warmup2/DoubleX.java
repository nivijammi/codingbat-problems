package edu.codingbat.warmup2;

public class DoubleX {

    boolean doubleX(String str) {
        for (int i = 0;i<str.length()-1; i++){
            if(str.charAt(i)=='x' )
                if (str.charAt(i+1)=='x'){
                return true;


            }else {
                return false;
            }

        }
        return false;
    }
    /*
        doubleX("axxbb") → true
        doubleX("axaxax") → false
        doubleX("xaxx") → false
    */
    public void testcountXX(){
        boolean result1 = doubleX("axxbb");
        System.out.println("result1 : "+result1 );

        boolean result2 = doubleX("axaxax");
        System.out.println("result2 : "+result2 );

        boolean result3 = doubleX("xaxx");
        System.out.println("result3 : "+result3 );


    }


    public static void main(String args[]){
        DoubleX cx = new DoubleX();
        cx.testcountXX();
    }

}
