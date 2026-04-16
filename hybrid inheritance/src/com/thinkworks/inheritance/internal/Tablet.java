package com.thinkworks.inheritance.internal;

import com.thinkworks.inheritance.external.Display;
import com.thinkworks.inheritance.external.Storage;
import com.thinkworks.inheritance.external.VideoPlayer;

public class Tablet extends Device implements VideoPlayer, Display, Storage {

    public Tablet(String brand, String model) {
        super(brand, model);
    }
    public void playVideo() {
        System.out.println("Tablet plays video");
    }
    public void showDisplay() {
        System.out.println("Tablet shows display");
    }
    public void showStorage() {
        System.out.println("Tablet shows storage");
    }
}
