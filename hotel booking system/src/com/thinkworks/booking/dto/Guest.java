package com.thinkworks.booking.dto;

public class Guest {

    private String guestName;
    private String guestPhoneNumber;
    private String guestEmail;
    private Room[] rooms;

    public Guest(String guestName, String guestPhoneNumber, String guestEmail) {
        this.guestName = guestName;
        this.guestPhoneNumber = guestPhoneNumber;
        this.guestEmail = guestEmail;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestPhoneNumber() {
        return guestPhoneNumber;
    }

    public void setGuestPhoneNumber(String guestPhoneNumber) {
        this.guestPhoneNumber = guestPhoneNumber;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
