package com.thinkworks.company.dto;

public class Order {

    private Product[] products;
    private String orderId;
    private Customer customer;
    private int productCount;



    public Order(Product[] products, String orderId, Customer customer, int productCount){

        this.orderId = orderId;
        this.customer = customer;
        this.productCount = productCount;
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double calculateOrderValue() {

//        for(int count=0; count <= products.length; count++){
//
//            if(count == products.length) {
//                System.out.println("all orders placed");
//                System.out.println("order value is: " + products.length);
//            }
//            else{
//                System.out.println("order failed");
//            }
//        }
        double totalPrice = 0;
        if (products != null) {


            for (Product product : products) {

                totalPrice = totalPrice + product.getPrice();
            }

        } else System.out.println("order failed");

        return totalPrice;
    }



}
