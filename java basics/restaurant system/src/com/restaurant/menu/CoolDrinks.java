package com.restaurant.menu;

public class CoolDrinks {

    public void selectDrink(){

        System.out.println("selected a drink of choice");
    }

    private void addOns(){

        System.out.println("added extra ice");
    }

    public void checkDrinks(){

        selectDrink();
        addOns();
    }
}
