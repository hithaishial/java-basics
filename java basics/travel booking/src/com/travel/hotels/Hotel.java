package com.travel.hotels;

public class Hotel {

    private void checkAvailability() {
        System.out.println("Checking hotel room availability...");
    }

    private void details(String name) {
        System.out.println("hotel name: ");
    }

    public void bookHotel(String name, String city) {
        checkAvailability();
        details(name);
        System.out.println("name: "+ name + ", name of the city: "+ city);
        System.out.println("Hotel booked successfully!");
    }

}
