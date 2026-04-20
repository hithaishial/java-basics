package com.thinkworks.methods.runner;

import com.thinkworks.methods.external.*;

import java.time.LocalDateTime;

public class MainRunner {
    public static void main(String[] args) {

        PulseSensor sensor1 = new PulseSensor("PS101", 72, "Active", LocalDateTime.now(), 85);
        PulseSensor sensor2 = new PulseSensor("PS101", 72, "Active", LocalDateTime.now(), 90);

        boolean result1 = sensor1.equals(sensor2);
        System.out.println(result1);

        NanoBot bot1 = new NanoBot("NB007", "Repair", 60, "Sector A", true);
        NanoBot bot2 = new NanoBot("NB007", "Repair", 80, "Sector B", true);

        boolean result2 = bot1.equals(bot2);
        System.out.println(result2);

        CryptoWallet wallet1 = new CryptoWallet("CW123", "Alice", 500.0, "BTC", false);
        CryptoWallet wallet2 = new CryptoWallet("CW123", "Alice", 1000.0, "BTC", true);

        boolean result3 = wallet1.equals(wallet2);
        System.out.println(result3);

        HoloDisplay display1 = new HoloDisplay("HD55", "4K", 70, "Cinema", false);
        HoloDisplay display2 = new HoloDisplay("HD55", "4K", 80, "Gaming", true);

        boolean result4 = display1.equals(display2);
        System.out.println(result4);

        BioChip chip1 = new BioChip("BC999", 36.5, 110.0, 98.0, "Stable");
        BioChip chip2 = new BioChip("BC999", 37.0, 115.0, 97.0, "Stable");

        boolean result5 = chip1.equals(chip2);
        System.out.println(result5);
    }
}

