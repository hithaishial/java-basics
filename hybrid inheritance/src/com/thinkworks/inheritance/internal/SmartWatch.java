package com.thinkworks.inheritance.internal;

import com.thinkworks.inheritance.external.Bluetooth;
import com.thinkworks.inheritance.external.Display;
import com.thinkworks.inheritance.external.Notification;

public class SmartWatch implements Bluetooth, Notification, Display {

    @Override
    public void connectBluetooth() {
        System.out.println("SmartWatch connects via Bluetooth");
    }

    @Override
    public void sendNotification() {
        System.out.println("SmartWatch sends notification");
    }

    @Override
    public void showDisplay() {
        System.out.println("SmartWatch shows display");
    }
}
