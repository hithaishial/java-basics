package com.thinkworks.booking.dto;

public class Room {

    private int roomNumber;
    private RoomTypeAndPrice roomTypeAndPrice;
    private boolean isAvailable;
    private int numberOfNightStays;

    public Room(int roomNumber, RoomTypeAndPrice roomTypeAndPrice, int numberOfNightStays, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomTypeAndPrice = roomTypeAndPrice;
        this.isAvailable = isAvailable;
        this.numberOfNightStays = numberOfNightStays;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomTypeAndPrice getRoomTypeAndPrice() {
        return roomTypeAndPrice;
    }

    public void setRoomTypeAndPrice(RoomTypeAndPrice roomTypeAndPrice) {
        this.roomTypeAndPrice = roomTypeAndPrice;
    }

    public int getNumberOfNightStays() {
        return numberOfNightStays;
    }

    public void setNumberOfNightStays(int numberOfNightStays) {
        this.numberOfNightStays = numberOfNightStays;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
