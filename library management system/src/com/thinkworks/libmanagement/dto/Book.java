package com.thinkworks.libmanagement.dto;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private double price;
    private int stock;

    public enum BookCategory {
        FICTION, NONFICTION, SCIENCE, HISTORY, TECHNOLOGY
    }


    static {

        System.out.println("Library System initialised");
    }

    {

        System.out.println("Book object created");
    }

    public Book(int bookId, String title, String author, double price, int stock){

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;

    }
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double calculateStockValue(){

        System.out.println("the stock value is: ");
        return price *stock;
    }


}
