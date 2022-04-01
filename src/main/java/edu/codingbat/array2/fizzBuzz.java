package edu.codingbat.array2;

public class fizzBuzz{

    public String fizzBuzz(int num) {
        String fzBz = "";


            if(num % 3 == 0 && num%5== 0){
                fzBz ="FizzBuzz";
            }
            else if(num % 5 == 0 ){
                fzBz ="Buzz";
            }
            else if(num % 3 == 0 ){
                fzBz ="Fizz";
            }
            else{
                System.out.println("number is not divisible by either 3 or 5");
            }

        System.out.println(fzBz);
        return fzBz;
    }

    public static void main(String[] args){
        fizzBuzz object = new fizzBuzz();
        object.fizzBuzz(4);
    }


}









