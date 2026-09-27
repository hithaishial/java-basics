package com.travel.runner;

import com.travel.flights.Flight;
import com.travel.flights.Pilot;
import com.travel.flights.Ticket;
import com.travel.hotels.Hotel;
import com.travel.hotels.Room;
import com.travel.hotels.Bookings;

public class MainRunner {

    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.bookFlight();

        Pilot pilot = new Pilot();
        pilot.startFlight("Stephen", 32, 5);

        Ticket ticket = new Ticket();
        ticket.checkTicket();

        Hotel hotel = new Hotel();
        hotel.bookHotel("la place", "Delhi");

        Room room = new Room();
        room.allocateRoom(243, 9);

        Bookings bookings = new Bookings();
        bookings.confirmBooking();


    }

    }
