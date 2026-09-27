package com.ecommerce.customers;

public class Customer {

    private void verifyLogin() {
        System.out.println("login was verified");
    }

    private void checkProfile() {
        System.out.println("customer profile checked");
    }

    public void placeOrder() {
        verifyLogin();
        checkProfile();
        System.out.println("Order is placed");
    }

}
