package com.thinkworks.banking.runner;

import com.thinkworks.banking.dto.Account;
import com.thinkworks.banking.enums.AccountType;
import com.thinkworks.banking.dto.Transaction;
import com.thinkworks.banking.service.AccountAndTransactionService;

public class MainRunner {

    public static void main(String[] args) {

        Account acc = new Account(348243, "Yogitha", AccountType.SAVINGS_ACCOUNT);
        Account acc1 = new Account(7865, "Hithaishi", AccountType.CURRENT_ACCOUNT);
        Account acc2 = new Account(9867421, "Hithaishi", AccountType.FD_ACCOUNT);

        Transaction transaction = new Transaction(01, 500, "credit", acc, acc2);
        Transaction transaction1 = new Transaction(02, 950, "debit", acc1, acc2);

        AccountAndTransactionService service = new AccountAndTransactionService();
        service.printAccountDetails(acc);
        System.out.println(" ");
        service.printAccountDetails(acc1);
        System.out.println(" ");
        service.printAccountDetails(acc2);
        System.out.println(" ");
        service.calculateFinalBalance(acc, transaction);
        System.out.println(" ");
        service.calculateFinalBalance(acc1, transaction1);
        System.out.println(" ");
        service.calculateFinalBalance(acc2, transaction);

    }
}
