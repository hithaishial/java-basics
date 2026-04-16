package com.thinkworks.inheritance.internal;

import com.thinkworks.inheritance.external.*;

public class Device {

       private String brand;
       private String model;

       public Device(String brand, String model){
        this.brand = brand;
        this.model = model;
       }

       public void deviceInfo() {
        System.out.println("Device: " + brand + " " + model);
       }
    }



