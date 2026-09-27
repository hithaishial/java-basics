package com.thinkworks.booking.service;
import com.thinkworks.booking.dto.Guest;
import com.thinkworks.booking.dto.Room;

public class Bookings {

    private static double totalPrice = 0;

    public void printRoomDetails(Room room){

        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room type: " + room.getRoomTypeAndPrice());
        System.out.println("Price for the selected room type for one night stay: " + room.getRoomTypeAndPrice().getPrice());
        System.out.println("Room availability: " + room.isAvailable());
    }

    public void printGuestDetails(Guest guest){

        System.out.println("Name of the guest: " + guest.getGuestName());
        System.out.println("Phone number: " + guest.getGuestPhoneNumber());
        System.out.println("Email: " + guest.getGuestEmail());
    }

    public void displayAvailableRoomList(Room[] rooms){

        if (rooms != null){
            for (Room room: rooms){
                if (room.isAvailable()){
                    System.out.println(room.getRoomTypeAndPrice());
                }
            }
        }
    }

    public double calculateTotalPrice(Room[] rooms){

        double totalPrice = 0;
        for (Room room: rooms){

            totalPrice = totalPrice + (room.getRoomTypeAndPrice().getPrice()*room.getNumberOfNightStays());
        }
        return totalPrice;
    }
}
