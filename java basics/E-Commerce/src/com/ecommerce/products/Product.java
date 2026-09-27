package com.ecommerce.products;

public class Product {

    private void checkStock() {
        System.out.println("Checking product stock");
    }

    private void checkDiscount() {
        System.out.println("final discount applied");
    }

    public void displayProduct() {
        checkStock();
        checkDiscount();
        System.out.println("Product details displayed!");
    }

}
