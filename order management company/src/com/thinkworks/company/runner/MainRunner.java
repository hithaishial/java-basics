package com.thinkworks.company.runner;

import com.thinkworks.company.dto.Product;
import com.thinkworks.company.dto.Customer;
import com.thinkworks.company.dto.Order;

public class MainRunner {

    public static void main(String[] args) {

        Product product = new Product("7437fhd", "facewash", 374.86, 3, "skincare");
        double value= product.calculateStockValue();
        System.out.println(value);
        System.out.println("  ");
        System.out.println("  ");

        Customer customer = new Customer("rt255", "Hithaishi", "hithaishi@gamail.com", "7283927837");
        customer.display();
        System.out.println("  ");
        System.out.println("  ");

        Order order = new Order("skincare", "376st", customer, 3);
        System.out.println(order.calculateOrderValue());

    }
}
