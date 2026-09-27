package com.travel.flights;

public class Flight {

    private void checkSchedule() {
        System.out.println(" flight schedule has been checked");
    }

    private void verifySeatAvailability() {
        System.out.println(" seat is available");
    }

    public void bookFlight() {
        checkSchedule();
        verifySeatAvailability();
        System.out.println("Flight booked successfully");
    }

}
