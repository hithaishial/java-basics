package com.thinkworks.banking.service;

import com.thinkworks.banking.dto.Account;
import com.thinkworks.banking.dto.Transaction;

public class AccountAndTransactionService {

    public void printAccountDetails(Account account){

        System.out.println("Holder name: " + account.getHolderName());
        System.out.println("Account type: " + account.getType());
        System.out.println("Balance: " + account.getBalance());
    }

    public double calculateFinalBalance(Account account, Transaction transaction) {
        double balanceAfterTransaction = account.getBalance();

        if (transaction.getTransactionType().equals("debit")
                && transaction.getSourceAccount().equals(account)) {

            System.out.println("Transaction ID: " + transaction.getTransactionId());
            System.out.println("Transaction type is debit");
            System.out.println("Sender's details: " + transaction.getSourceAccount().getHolderName()
                    + ", Balance: " + transaction.getSourceAccount().getBalance());
            System.out.println("Receiver's details: " + transaction.getDestinationAccount().getHolderName()
                    + ", Balance: " + transaction.getDestinationAccount().getBalance());
            System.out.println("Transaction amount is: " + transaction.getAmount());

            balanceAfterTransaction -= transaction.getAmount();
            account.setBalance(balanceAfterTransaction);
            System.out.println("Balance after debit: " + balanceAfterTransaction);
        }

        if (transaction.getTransactionType().equals("credit")
                && transaction.getDestinationAccount().equals(account)) {

            System.out.println("Transaction ID: " + transaction.getTransactionId());
            System.out.println("Transaction type is credit");
            System.out.println("Sender's details: " + transaction.getSourceAccount().getHolderName()
                    + ", Balance: " + transaction.getSourceAccount().getBalance());
            System.out.println("Receiver's details: " + transaction.getDestinationAccount().getHolderName()
                    + ", Balance: " + transaction.getDestinationAccount().getBalance());
            System.out.println("Transaction amount is: " + transaction.getAmount());

            balanceAfterTransaction += transaction.getAmount();
            account.setBalance(balanceAfterTransaction);
            System.out.println("Balance after credit: " + balanceAfterTransaction);
        }

        return balanceAfterTransaction;
    }


}


