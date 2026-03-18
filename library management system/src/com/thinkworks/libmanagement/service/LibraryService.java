package com.thinkworks.libmanagement.service;

import com.thinkworks.libmanagement.dto.Book;
import com.thinkworks.libmanagement.dto.BorrowRecord;
import com.thinkworks.libmanagement.dto.Member;

public class LibraryService {

    static final String LIBRARY_NAME = "City Central Library";

    public void printBookDetails(Book book) {

        System.out.println("Book ID: " + book.getBookId());
        System.out.println("Title of the book: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price of the book: " + book.getPrice());
        System.out.println("Stock of the books: " + book.getStock());
    }

    public void printMemberDetails(Member member) {

        System.out.println("Member ID: " + member.getMemberId());
        System.out.println("Name of the member: " + member.getName());
        System.out.println("Email of the member: " + member.getEmail());
        System.out.println("Membership type is: " + member.getMembershipType());
    }

    public void printBorrowRecordDetails(BorrowRecord borrowRecord) {

        System.out.println("Member name: " + borrowRecord.getMember().getName());
        System.out.println("List of books: " + borrowRecord.getBooks());
        System.out.println("Total borrow value: " + borrowRecord.getBorrowCount());
    }

    public double calculateLibraryValue(Book[] books) {

        double totalStockValue = 0;
        if (books != null) {

            for (Book book : books) {

                totalStockValue = totalStockValue + book.getStock();

            }
        } else System.out.println("Value is null, please re enter the value");

        return totalStockValue;
    }

    public void findLowStockBooks(Book[] books) {
        System.out.println("Books running low in stock <3:");
        if (books != null) {
            for (Book book : books) {
                if (book.getStock() < 3) {
                    System.out.println(" Title " + book.getTitle() + "Stock: " + book.getStock());
                }
            }
        }
    }
}
