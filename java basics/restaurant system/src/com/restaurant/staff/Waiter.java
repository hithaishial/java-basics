package com.restaurant.staff;

public class Waiter {

    public void order(String orderName){

        System.out.println("order received for: " + orderName);
    }

    private void giveBill(double bill){

        System.out.println("amount costed: " + bill);
    }

    public void info(String orderName, double bill){

        order(orderName);
        giveBill(bill);
    }
}
