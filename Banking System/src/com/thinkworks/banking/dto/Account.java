package com.thinkworks.banking.dto;

import com.thinkworks.banking.enums.AccountType;

public class Account {

    private double balance;
    private String holderName;
    private AccountType type;

    public Account(double balance, String holderName, AccountType type) {
        this.balance = balance;
        this.holderName = holderName;
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
}
