package codecademy;

public class CarLoan {
    //this program calculate the monthly car payment a user should expect to make after taking out a car loan.
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;


    public void monthlyPaymentToBePaid() {

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! you must take out a valid loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("the car is paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }

    public static void main(String[] args) {
        CarLoan loan = new CarLoan();
        loan.monthlyPaymentToBePaid();
    }
}

