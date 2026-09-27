package com.travel.flights;

public class Ticket {

    private void genTicketNumber() {
        System.out.println("Generating ticket number");
    }

    private void assignSeat() {
        System.out.println("Assigned seat");
    }

    public void checkTicket() {
        genTicketNumber();
        assignSeat();
        System.out.println("Ticket issued");
    }

}
