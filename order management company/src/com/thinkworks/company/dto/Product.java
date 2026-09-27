package com.thinkworks.company.dto;

public class Product {

    private String productId;
    private String productName;
    private double price;
    private int quantity;
    private String category;

    public Product(String productId, String productName, double price, int quantity, String category){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public double calculateStockValue(){

        double stockValue= (price* quantity);
        System.out.println("Stock Value is: " + stockValue);
        System.out.println("product id: " + getProductId());
        System.out.println("product name: "+ getProductName());
        System.out.println("price of the product: "+ getPrice());
        System.out.println("quantity: "+ getQuantity());
        System.out.println("category of the product: "+ getCategory());
        return stockValue;
    }

}
