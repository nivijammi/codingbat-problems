package edu.codingbat;

public class no14 {
    /*
    * Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
*/

    public boolean no14(int[] numbers) {
        boolean hasNumber1 = false;
        boolean hasNumber4 = false;

        for (int number : numbers) {
            if (number == 1) {
                hasNumber1 = true;
            }

            if (number == 4) {
                hasNumber4 = true;
            }
        }
        if(hasNumber1 && !hasNumber4){
            System.out.println("true");
            return true;
        }
        if(!hasNumber1 && hasNumber4){
            System.out.println("true");
            return true;
        }
        if(hasNumber1 && hasNumber4){
            System.out.println("false");
            return false;
        }
        if(!hasNumber1 && !hasNumber4){
            System.out.println("true");
            return true;
        }


        return false;

    }
        
    public static void main(String[] args){
            no14 object = new no14();
            int[] numbers = {1,2,3,4};
            object.no14(numbers);
    }
}
