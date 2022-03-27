package edu.codingbat.Array2;

public class fizzBizzSolution2 {
    /*
    Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.


fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

     */


    public String[] fizzBuzz(int start, int end) {

        //find the length of array
        String[] newStringArray = new String[end - start];

        for (int i = start; i < end; i++){
            if(i % 3 != 0 && i % 5 != 0){
                newStringArray[i - start] = String.valueOf(i);
            }
            if(i % 3 == 0){
                newStringArray[i - start] = "Fizz";
            }
            if(i % 5 == 0){
                newStringArray[i - start] = "Buzz";
            }
            if(i % 3 == 0 && i % 5 == 0){
                newStringArray[i - start] = "FizzBuzz";
            }


        }
        for (int i = 0; i < end; i++){
            System.out.println(newStringArray[i]);
        }
        return newStringArray;
    }
    public static void main(String[] args){
        fizzBizzSolution2 object = new fizzBizzSolution2();
        object.fizzBuzz(1,6);
    }


}


