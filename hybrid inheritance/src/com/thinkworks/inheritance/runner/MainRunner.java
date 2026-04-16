package com.thinkworks.inheritance.runner;

import com.thinkworks.inheritance.internal.*;

public class MainRunner {

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.capture();
        smartPhone.playMusic();
        smartPhone.navigate();

        SmartWatch smartWatch = new SmartWatch();
        smartWatch.connectBluetooth();
        smartWatch.sendNotification();
        smartWatch.showDisplay();

        PrinterMachine printerMachine = new PrinterMachine();
        printerMachine.scanDocument();
        printerMachine.printDocument();
        printerMachine.connectNetwork();

        OnlinePaymentSystem onlinePaymentSystem = new OnlinePaymentSystem();
        onlinePaymentSystem.makePayment();
        onlinePaymentSystem.enableSecurity();
        onlinePaymentSystem.processRefund();

        ECommerceApp app = new ECommerceApp();
        app.placeOrder();
        app.deliverOrder();
        app.trackOrder();

        SmartPhoneHybrid smartPhoneHybrid = new SmartPhoneHybrid("Samsung", "Galaxy S25");
        smartPhoneHybrid.deviceInfo();
        smartPhoneHybrid.capture();
        smartPhoneHybrid.playMusic();
        smartPhoneHybrid.connectWiFi();

        Tablet tablet = new Tablet("Apple", "iPad Pro");
        tablet.deviceInfo();
        tablet.playVideo(); tablet.showDisplay();
        tablet.showStorage();

        Laptop laptop = new Laptop("Dell", "XPS 15");
        laptop.deviceInfo();
        laptop.charge();
        laptop.showBatteryStatus();
        laptop.connectNetwork();

        ATMSystem atm = new ATMSystem("NCR", "ATM-2026");
        atm.deviceInfo();
        atm.makePayment();
        atm.enableSecurity();
        atm.generateReport();
    }
}
