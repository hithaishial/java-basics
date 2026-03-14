package com.thinkworks.company.runner;

import com.thinkworks.company.dto.Product;
import com.thinkworks.company.dto.Customer;
import com.thinkworks.company.dto.Order;
import com.thinkworks.company.service.InventoryService;

public class MainRunner {

    public static void main(String[] args) {

        Product product = new Product("7437fhd", "facewash", 374.86, 3, "skincare");
        Product product1 = new Product("2434rd", "moisturizer", 599.57, 1, "skincare");
        double value= product.calculateStockValue();
        System.out.println( "stock value: "+value);
        System.out.println("  ");
        System.out.println("  ");

        Customer customer = new Customer("rt255", "Hithaishi", "hithaishi@gamail.com", "7283927837");
        customer.display();
        System.out.println("  ");
        System.out.println("  ");

        Product[] products = {product, product1};
        Order order = new Order(products, "376st", customer, 3);
        System.out.println("order value is: "+order.calculateOrderValue());
        System.out.println("  ");
        System.out.println("  ");

        InventoryService inventoryService = new InventoryService();
        inventoryService.printProductDetails(product);
        inventoryService.printProductDetails(product1);
        inventoryService.printCustomerDetalis(customer);
        inventoryService.printOrderDetails(order);
        inventoryService.calculateInventoryValue(products);
        inventoryService.findLowStockProducts(products);

    }
}
