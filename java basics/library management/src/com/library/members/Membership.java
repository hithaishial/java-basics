package com.library.members;

public class Membership {

    private void checkApplication() {
        System.out.println("checking membership application");
    }

    private void confirmPayment() {
        System.out.println("Confirmed membership payment");
    }

    public void activateMembership() {
        checkApplication();
        confirmPayment();
        System.out.println("Membership activated");
    }

}
