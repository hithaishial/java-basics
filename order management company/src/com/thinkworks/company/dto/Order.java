package com.thinkworks.company.dto;

public class Order {

    private String product;
    private String orderId;
    private Customer customer;
    private int productCount;

    Products[] products = new Products[3];

    public Order(String product, String orderId, Customer customer, int productCount){

        this.product = product;
        this.orderId = orderId;
        this.customer = customer;
        this.productCount = productCount;

        products[0] = new Products("facewash");
        products[1] = new Products("shampoo");
        products[2] = new Products("body wash");

    }

    public double calculateOrderValue(){

        for(int count=0; count <= products.length; count++){

            if(count == products.length) {
                System.out.println("all orders placed");
                System.out.println("order value is: " + products.length);
            }
            else{
                System.out.println("order failed");
            }
        }
        return products.length;
    }



}
