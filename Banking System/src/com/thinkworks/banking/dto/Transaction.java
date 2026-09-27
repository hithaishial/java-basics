package com.thinkworks.banking.dto;

public class Transaction {

    private int transactionId;
    private double amount;
    private String transactionType;
    private Account sourceAccount;
    private Account destinationAccount;

    public Transaction(int transactionId, double amount, String transactionType, Account sourceAccount, Account destinationAccount) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }
}

