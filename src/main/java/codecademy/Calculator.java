package codecademy;

public class Calculator{
    /*
    will use classes, methods, and objects to create a simple arithmetic calculator. The calculator will be able to:

    Add two integers
    Subtract two integers
    Multiply two integers
    Divide two integers
    Apply the modulo operator on two integers
     */


    public Calculator(){

    }
    // adding two int
    public int add(int a, int b){
        int sum = a + b;
        System.out.println("The sum of the two integer is "+ sum + ".");
        return sum;

    }
    // subtracting two int
    public int subtract(int a, int b){
        int difference = a-b;
        System.out.println("The difference of the two integers is " + difference + ".");
        return difference;
    }
    // multiplying two int
    public int multiply(int a, int b){
        int product = a*b;
        System.out.println("The product of the two integers is "+ product +".");
        return product;
    }
    //divide two int
    public int divide(int a,int b){
        int answer = a/b;
        System.out.println("The answer of the two integers is "+ answer +".");
        return answer;
    }
    // moduloes
    public int modulo(int a, int b){
        int remainder = a%b;
        System.out.println("The modulo of the two integers is "+ remainder +".");
        return remainder;
    }


    public static void main(String[]args){
        Calculator myCalculator = new Calculator();
        myCalculator.add(5,7);
        myCalculator.subtract(45,11);
        myCalculator.multiply(121,11);
        myCalculator.divide(110,11);
        myCalculator.modulo(12,3);


    }
}

