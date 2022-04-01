package edu.codingbat.array2;

public class fizzBuzzSolution1 {
    /*
    Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.


fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

     */


        public String[] fizzBuzz(int start, int end) {




            String[] fzBz= new String[end-start];

            for(int i = start, j=0; i < end;i++,j++){

                if(i % 15 == 0 ){
                    fzBz[j] ="FizzBuzz";
                }
                else if(i % 5 == 0 ){
                    fzBz[j] ="Buzz";
                }
                else if(i % 3 == 0 ){
                    fzBz[j] ="Fizz";
                }
                else  fzBz[j] = String.valueOf(i);
            }
            return fzBz;
        }

    public static void main(String[] args){
        fizzBuzzSolution1 object = new fizzBuzzSolution1();
        object.fizzBuzz(1,6);
    }


}
