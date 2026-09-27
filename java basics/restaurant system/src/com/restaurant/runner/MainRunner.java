package com.restaurant.runner;
import com.restaurant.menu.Dish;
import com.restaurant.menu.Desserts;
import com.restaurant.menu.CoolDrinks;
import com.restaurant.staff.Chef;
import com.restaurant.staff.Waiter;
import com.restaurant.staff.Manager;

public class MainRunner {

    public static void main(String[] args) {

        Dish dish = new Dish();
        dish.checkMethods();

        Desserts desserts = new Desserts();
        desserts.checkDesserts();

        CoolDrinks coolDrinks = new CoolDrinks();
        coolDrinks.checkDrinks();

        Chef chef = new Chef();
        chef.checkChef("david", "garlic bread");

        Manager manager = new Manager();
        manager.checkManager("mark", 35);

        Waiter waiter = new Waiter();
        waiter.info("garlic bread", 345.8);
    }
}
