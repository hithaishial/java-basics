package com.restaurant.staff;

public class Chef {

    private void details(String name){

        System.out.println("name of the chef: " + name);

    }

    public void cook(){

        System.out.println("cooking meal");
    }

    public void checkChef(String name, String sigDish){

        details(name);
        cook();
    }
}
