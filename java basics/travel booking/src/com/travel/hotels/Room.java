package com.travel.hotels;

public class Room {

    private void cleanRoom() {
        System.out.println("Cleaning room");
    }

    private void details(int roomNumber) {
        System.out.println("room number");
    }

    public void allocateRoom(int roomNumber, int floorNumber) {
        cleanRoom();
        details(roomNumber);
        System.out.println("Room allocated");
    }
}
