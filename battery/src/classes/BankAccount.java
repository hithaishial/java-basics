package classes;

public class BankAccount {


    public void transaction(String accountNumber, String holderName, String accountType,
                             String branchName) {
        System.out.println("acc no.: "+ accountNumber + ", account type: " + accountType+ ", branch name: "+ branchName);
    }

    public void transaction(String holderName, String accountType,
                            String branchName) {
        System.out.println("Transaction with holderName and other details");

    }

    public void transaction(String accountType, double balance, String branchName) {
        System.out.println("Transaction with accountType, balance, branchName");

    }

    public void transaction(double balance, String branchName) {
        System.out.println("Transaction with balance and branchName");

    }

    public void transaction(String branchName) {
        System.out.println("Transaction with branchName only");

    }

    public void transaction() {
        System.out.println("transaction method");

    }
}