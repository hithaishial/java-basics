package com.travel.flights;

public class Pilot {

    private void checkLicense() {
        System.out.println("Checking pilot license");
    }

    private void details(String name) {
        System.out.println("Reviewing flight plan");
    }

    public void startFlight(String name, int age, int yrsOfExperience) {
        checkLicense();
        details(name);
        System.out.println("Pilot ready for takeoff");
    }

}
