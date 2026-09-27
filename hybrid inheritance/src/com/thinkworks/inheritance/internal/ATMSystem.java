package com.thinkworks.inheritance.internal;

import com.thinkworks.inheritance.external.Payment;
import com.thinkworks.inheritance.external.Report;
import com.thinkworks.inheritance.external.Security;

public class ATMSystem extends Device implements Payment, Security, Report {

    public ATMSystem(String brand, String model) {
        super(brand, model);
    }
    public void makePayment() {
        System.out.println("ATM processes payment");
    }

    public void enableSecurity() {
        System.out.println("ATM security enabled");
    }

    public void generateReport() {
        System.out.println("ATM generates report");
    }
}
