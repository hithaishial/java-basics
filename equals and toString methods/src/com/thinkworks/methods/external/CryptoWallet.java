package com.thinkworks.methods.external;

public class CryptoWallet {
    private String walletId;
    private String owner;
    private double balance;
    private String currencyType;
    private boolean isLocked;

    public CryptoWallet(String walletId, String owner, double balance, String currencyType, boolean isLocked) {
        this.walletId = walletId;
        this.owner = owner;
        this.balance = balance;
        this.currencyType = currencyType;
        this.isLocked = isLocked;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " " + currencyType + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " " + currencyType + ". Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void generateKey() {
        System.out.println("Generated key for wallet: " + walletId + "_KEY123");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CryptoWallet) {
            CryptoWallet other = (CryptoWallet) obj;
            if (this.walletId.equals(other.walletId)) {
                if (this.owner.equals(other.owner)) {
                    return true;
                }
            }
        } else return false;
        return false;
    }

    @Override
    public String toString() {
        return "CryptoWallet [ID=" + walletId + ", Owner=" + owner + ", Balance=" + balance +
                " " + currencyType + ", Locked=" + isLocked + "]";
    }
}

