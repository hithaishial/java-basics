package com.restaurant.staff;

public class Manager {

    public void checkHospitality(){

        System.out.println("checking hospitality");
    }

    private void details(String name){

        System.out.println("manager name: " + name);
    }

    public void checkManager(String name, int age){

        checkHospitality();
        details(name);
    }
}
