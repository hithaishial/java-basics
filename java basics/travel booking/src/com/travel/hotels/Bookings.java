package com.travel.hotels;

public class Bookings {

    private void checkDates() {
        System.out.println("checking booking dates");
    }

    private void confirmPayment() {
        System.out.println("Confirmed payment");
    }

    public void confirmBooking() {
        checkDates();
        confirmPayment();
        System.out.println("Booking confirmed");
    }

}
