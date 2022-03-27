package codecademy;

public class Magic {
    //a small program that performs a mathematical magic trick! It will involve performing arithmetic operations on an integer that you choose.
    public static void main(String[] args) {
        int myNumber = 15;
        // myNumber is same as original number
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);
    }
}