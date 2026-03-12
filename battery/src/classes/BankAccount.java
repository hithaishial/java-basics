package classes;

public class BankAccount {
    String accountNumber;
    String holderName;
    String accountType;
    double balance;
    String branchName;

    public void transaction(String accountNumber, String holderName, String accountType,
                            double balance, String branchName) {
        this.transaction(holderName, accountType, balance, branchName);
        System.out.println("acc no.: "+ accountNumber+ ", holder name: "+ holderName+ ", account type: " + accountType+ ", balance:"+ balance+", branch name: "+ branchName);
    }

    public void transaction(String holderName, String accountType,
                            double balance, String branchName) {
        System.out.println("Transaction with holderName and other details");
        this.transaction(accountType, balance, branchName);
    }

    public void transaction(String accountType, double balance, String branchName) {
        System.out.println("Transaction with accountType, balance, branchName");
        this.transaction(balance, branchName);
    }

    public void transaction(double balance, String branchName) {
        System.out.println("Transaction with balance and branchName");
        this.transaction(branchName);
    }

    public void transaction(String branchName) {
        System.out.println("Transaction with branchName only");
        this.transaction();
    }

    public void transaction() {
        System.out.println("transaction method");

    }
}