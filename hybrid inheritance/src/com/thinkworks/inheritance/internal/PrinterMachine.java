package com.thinkworks.inheritance.internal;

import com.thinkworks.inheritance.external.Network;
import com.thinkworks.inheritance.external.Printer;
import com.thinkworks.inheritance.external.Scanner;

public class PrinterMachine implements Scanner, Printer, Network {

    @Override
    public void scanDocument() {
        System.out.println("PrinterMachine scans document");
    }

    @Override
    public void printDocument() {
        System.out.println("PrinterMachine prints document");
    }

    @Override
    public void connectNetwork() {
        System.out.println("PrinterMachine connects to network");
    }
}
