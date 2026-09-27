package com.thinkworks.inheritance.internal;

import com.thinkworks.inheritance.external.Camera;
import com.thinkworks.inheritance.external.GPS;
import com.thinkworks.inheritance.external.MusicPlayer;

public class SmartPhone implements Camera, MusicPlayer, GPS {

    @Override
    public void capture() {
        System.out.println("SmartPhone captures photo");
    }

    @Override
    public void playMusic() {
        System.out.println("SmartPhone plays music");
    }

    @Override
    public void navigate() {
        System.out.println("SmartPhone navigates via GPS");
    }
}
