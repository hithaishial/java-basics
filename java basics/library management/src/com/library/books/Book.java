package com.library.books;

public class Book {

        private void checkbook() {
            System.out.println("checking book");
        }

        private void checkAvailability() {
            System.out.println("Checking availability");
        }

        public void issueBook() {
            checkbook();
            checkAvailability();
            System.out.println("Book issued");
        }

    }
