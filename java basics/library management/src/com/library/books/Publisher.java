package com.library.books;

public class Publisher {

    private void checkPublisherId() {
        System.out.println("checking id");
    }

    private void checkContracts() {
        System.out.println("Checking contracts");
    }

    public void publishBook() {
        checkPublisherId();
        checkContracts();
        System.out.println("Book published");
    }

}
