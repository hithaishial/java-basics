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

        double balanceAfterTransaction = 0;
        if (transaction.getTransactionType() == "debit") {

            System.out.println("Transaction ID: " + transaction.getTransactionId());
            System.out.println("Transaction type is debit");
            System.out.println("Sender's details: " + account.getHolderName() + " " + account.getBalance());
            System.out.println("Receiver's details: " + account.getHolderName() + " " + account.getBalance());
            System.out.println("Transaction amount is: " + transaction.getAmount());
            balanceAfterTransaction = balanceAfterTransaction - (transaction.getAmount());
            System.out.println("Balance amount after debited: " + balanceAfterTransaction);
        }
        if (transaction.getTransactionType() == "credit") {

            System.out.println("Transaction ID: " + transaction.getTransactionId());
            System.out.println("Transaction type is credit");
            System.out.println("Sender's details: " + account.getHolderName() + " " + account.getBalance());
            System.out.println("Receiver's details: " + account.getHolderName() + " " + account.getBalance());
            System.out.println("Transaction amount is: " + transaction.getAmount());
            balanceAfterTransaction = balanceAfterTransaction + transaction.getAmount();
            System.out.println("Balance amount after credited: " + balanceAfterTransaction);

        }
        return balanceAfterTransaction;


    }

    public void printTransactionDetails(){

        System.out.println(calculateFinalBalance(account, transaction));

    }
}


