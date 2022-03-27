package codecademy;

import java.util.ArrayList;

public class Client {

    String branchName;
    SavingsAccount savings;
    ArrayList<SavingsAccount> accounts = new ArrayList<>();

    public Client(String branch){
        branchName = branch;
    }

    private void createSavingsAccount(String s, String s1, String s2) {
        savings = new SavingsAccount(2000);
        accounts.add(savings);

        //Check balance:
        savings.checkBalance();

        //Withdrawing:
        savings.withdraw(300);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

        System.out.println(savings);
    }

    private void createCheckingsAccount(String s, String s1, String s2) {
        savings = new SavingsAccount(1000);
        accounts.add(savings);

        //Check balance:
        savings.checkBalance();

        //Withdrawing:
        savings.withdraw(300);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

        System.out.println(savings);
    }

    public static void main(String args[]){
        Client client = new Client("Polaris Chase");
        client.createSavingsAccount("Nivi Jammi", "25", "1001");
        client.createCheckingsAccount("Nivi Jammi", "20", "1002");
    }


}
