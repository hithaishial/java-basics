package runner;

import classes.BankAccount;

public class MainRunner {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.transaction("ACC123", "Hithaishi", "Savings", 50000.0, "Yeshwantpur");



    }
}

