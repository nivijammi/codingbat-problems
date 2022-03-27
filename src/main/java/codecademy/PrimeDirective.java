package codecademy;// Import statement:

import java.util.ArrayList;

class PrimeDirective {

    // Add your methods here:
    public boolean isPrime(int number) {
        //if number is 2 or numbers less than 2? Statement for edge cases.
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }
    /*
    - what makes a prime number a prime:
    - greater than 1
    - only divisible by 1 and itself
    - Every number is divisible by 1, so don't really care about being able to divide by 1.
    - If number is prime, then number should not be divisible by any integers between 2 and number-1.
    */
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    /*
    - Create a new arrayList primes;
    -
     */

    public ArrayList<Integer> onlyPrimes(int[]numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for(int number: numbers) {
            if (isPrime(number) == true) {
                //System.out.println(number);
                primes.add(Integer.valueOf(number));
            }
        }

        return primes;
    }


    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();

        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        //System.out.println(pd.isPrime(0));
        ArrayList<Integer> primes = pd.onlyPrimes(numbers);
        System.out.println(primes);

    }

}