package com.thinkworks.booking.dto;

public enum RoomTypeAndPrice {

    SINGLE(2000), DOUBLE(3500), DELUXE(5000), SUITE(6500), FAMILY(5100), PENTHOUSE_SUITE(8000);

    private final int price;

    RoomTypeAndPrice(int price) {

        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
