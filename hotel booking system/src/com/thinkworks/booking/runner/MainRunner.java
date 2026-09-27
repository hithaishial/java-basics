package com.thinkworks.booking.runner;

import com.thinkworks.booking.dto.Guest;
import com.thinkworks.booking.dto.Room;
import com.thinkworks.booking.dto.RoomTypeAndPrice;
import com.thinkworks.booking.service.Bookings;

public class MainRunner {

    public static void main(String[] args) {

        Room r = new Room(101, RoomTypeAndPrice.SUITE, 3, true);
        Room r1 = new Room(102, RoomTypeAndPrice.FAMILY, 2, false);
        Room r2 = new Room(103, RoomTypeAndPrice.DOUBLE, 4, true);

        Room[] rooms = {r, r1, r2};

        Guest guest = new Guest("hithaishi", "8723487893", "hitha@gmail.com");
        Guest guest1 = new Guest("yogitha", "8765449870", "yogi@gmail.com");
        Guest guest2 = new Guest("hithaishi", "8378435897", "hithaishi@gmail.com");

        Bookings bookings = new Bookings();

        System.out.println("Showing room details: ");
        bookings.printRoomDetails(r);
        bookings.printRoomDetails(r1);
        bookings.printRoomDetails(r2);

        System.out.println("  ");
        System.out.println("  ");

        System.out.println("Showing guest details: ");
        bookings.printGuestDetails(guest);
        bookings.printGuestDetails(guest1);
        bookings.printGuestDetails(guest2);

        System.out.println("  ");
        System.out.println("  ");

        System.out.println("Showing the list of available rooms: ");
        bookings.displayAvailableRoomList(rooms);

        System.out.println("  ");
        System.out.println("  ");

        System.out.println("Total price: " + bookings.calculateTotalPrice(rooms));
    }
}
