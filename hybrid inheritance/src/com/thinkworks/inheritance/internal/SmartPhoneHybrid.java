package com.thinkworks.inheritance.internal;

import com.thinkworks.inheritance.external.Camera;
import com.thinkworks.inheritance.external.MusicPlayer;
import com.thinkworks.inheritance.external.Wifi;

public class SmartPhoneHybrid extends Device implements Camera, MusicPlayer, Wifi {

    public SmartPhoneHybrid(String brand, String model) {
        super(brand, model);
    }

    public void capture() {
        System.out.println("SmartPhoneHybrid captures photo");
    }

    public void playMusic() {
        System.out.println("SmartPhoneHybrid plays music");
    }

    public void connectWiFi() {
        System.out.println("SmartPhoneHybrid connects to WiFi");
    }


}
