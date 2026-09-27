package com.library.books;

public class Author {

    private void authorDetails(String name) {
        System.out.println("author name: " + name);
    }

    private void publishedWorks() {
        System.out.println("published works");
    }

    public void registerAuthor() {
        authorDetails("Rabindranath Tagore");
        publishedWorks();
        System.out.println("Author registered");
    }

}
