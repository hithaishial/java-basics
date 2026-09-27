package com.thinkworks.libmanagement.runner;

import com.thinkworks.libmanagement.dto.Book;
import com.thinkworks.libmanagement.dto.Book.BookCategory;
import com.thinkworks.libmanagement.dto.Member;
import com.thinkworks.libmanagement.dto.Member.MembershipType;
import com.thinkworks.libmanagement.dto.BorrowRecord;
import com.thinkworks.libmanagement.service.LibraryService;

public class MainRunner {
    public static void main(String[] args) {

        Book b1 = new Book(101, "The Great Gatsby", "F. Scott Fitzgerald", 300.0, 5, BookCategory.FICTION);
        Book b2 = new Book(102, "Sapiens", "Yuval Noah Harari", 500.0, 2, BookCategory.HISTORY);
        Book b3 = new Book(103, "Brief Answers to Big Questions", "Stephen Hawking", 450.0, 4, BookCategory.SCIENCE);
        Book b4 = new Book(104, "Clean Code", "Robert C. Martin", 600.0, 1, BookCategory.TECHNOLOGY);
        Book b5 = new Book(105, "Educated", "Tara Westover", 350.0, 6, BookCategory.NONFICTION);

        Book[] books = { b1, b2, b3, b4, b5 };

        Member member = new Member("201", "Alice Johnson", "alice@example.com", MembershipType.PREMIUM);

        BorrowRecord record = new BorrowRecord(301, member, books, books.length);

        LibraryService service = new LibraryService();

        System.out.println("BOOK DETAILS: ");
        for (Book book : books) {
            service.printBookDetails(book);
        }

        System.out.println("MEMBER DETAILS: ");
        service.printMemberDetails(member);

        System.out.println("BORROW RECORD DETAILS: ");
        service.printBorrowRecordDetails(record);

        System.out.println("LIBRARY INVENTORY VALUE: ");
        double totalValue = service.calculateLibraryValue(books);
        System.out.println("Total Library Inventory Value: " + totalValue);
        System.out.println("  ");

        System.out.println("LOW STOCK BOOKS: ");
        service.findLowStockBooks(books);
    }
}