package com.thinkworks.inheritance.internal;

import com.thinkworks.inheritance.external.Battery;
import com.thinkworks.inheritance.external.Charging;
import com.thinkworks.inheritance.external.Network;

public class Laptop extends Device implements Charging, Battery, Network {

    public Laptop(String brand, String model) {
        super(brand, model);
    }
    public void charge() {
        System.out.println("Laptop charging"); }
    public void showBatteryStatus() {
        System.out.println("Laptop battery status"); }
    public void connectNetwork() {
        System.out.println("Laptop connects to network"); }
}
