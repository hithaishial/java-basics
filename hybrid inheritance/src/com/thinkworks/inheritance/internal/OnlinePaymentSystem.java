package com.thinkworks.inheritance.internal;

import com.thinkworks.inheritance.external.Payment;
import com.thinkworks.inheritance.external.Refund;
import com.thinkworks.inheritance.external.Security;

public class OnlinePaymentSystem implements Payment, Security, Refund {

    @Override
    public void makePayment() {
        System.out.println("Payment made online");
    }

    @Override
    public void enableSecurity() {
        System.out.println("Security enabled for payment");
    }

    @Override
    public void processRefund() {
        System.out.println("Refund processed");
    }
}
