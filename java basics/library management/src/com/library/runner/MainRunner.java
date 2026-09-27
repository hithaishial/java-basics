package com.library.runner;

import com.library.books.Book;
import com.library.books.Author;
import com.library.books.Publisher;
import com.library.members.Member;
import com.library.members.Librarian;
import com.library.members.Membership;

public class MainRunner {

    public static void main(String[] args) {
        Book book = new Book();
        book.issueBook();

        Author author = new Author();
        author.registerAuthor();

        Publisher publisher = new Publisher();
        publisher.publishBook();

        Member member = new Member();
        member.registerMember();

        Librarian librarian = new Librarian();
        librarian.assistMember();

        Membership membership = new Membership();
        membership.activateMembership();

        
    }



}
