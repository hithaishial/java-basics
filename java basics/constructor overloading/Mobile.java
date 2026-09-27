class Mobile {

    String mobileId;
    String brand;
    String model;
    String os;
    String color;
    int ram;
    int storage;
    int batteryCapacity;
    double price;
    int releaseYear;

    static int count = 0;

    Mobile(String mobileId, String brand, String model, String os, String color, int ram, int storage, int batteryCapacity, double price, int releaseYear) {
        this(brand, model, os, color, ram, storage, batteryCapacity, price, releaseYear);
        this.mobileId = mobileId;
        System.out.println("Mobile ID: " + mobileId);
    }

    Mobile(String brand, String model, String os, String color, int ram, int storage, int batteryCapacity, double price, int releaseYear) {
        this(model, os, color, ram, storage, batteryCapacity, price, releaseYear);
        this.brand = brand;
        System.out.println("Brand: " + brand);
    }

    Mobile(String model, String os, String color, int ram, int storage, int batteryCapacity, double price, int releaseYear) {
        this(os, color, ram, storage, batteryCapacity, price, releaseYear);
        this.model = model;
        System.out.println("Model: " + model);
    }

    Mobile(String os, String color, int ram, int storage, int batteryCapacity, double price, int releaseYear) {
        this(color, ram, storage, batteryCapacity, price, releaseYear);
        this.os = os;
        System.out.println("OS: " + os);
    }

    Mobile(String color, int ram, int storage, int batteryCapacity, double price, int releaseYear) {
        this(ram, storage, batteryCapacity, price, releaseYear);
        this.color = color;
        System.out.println("Color: " + color);
    }

    Mobile(int ram, int storage, int batteryCapacity, double price, int releaseYear) {
        this(storage, batteryCapacity, price, releaseYear);
        this.ram = ram;
        System.out.println("RAM: " + ram);
    }

    Mobile(int storage, int batteryCapacity, double price, int releaseYear) {
        this(batteryCapacity, price, releaseYear);
        this.storage = storage;
        System.out.println("Storage: " + storage);
    }

    Mobile(int batteryCapacity, double price, int releaseYear) {
        this(price, releaseYear);
        this.batteryCapacity = batteryCapacity;
        System.out.println("Battery Capacity: " + batteryCapacity);
    }

    Mobile(double price, int releaseYear) {
        this(releaseYear);
        this.price = price;
        System.out.println("Price: " + price);
    }

    Mobile(int releaseYear) {
        this();
        this.releaseYear = releaseYear;
        System.out.println("Release Year: " + releaseYear);
    }

    Mobile() {
        System.out.println("constructor: Mobile");
        count++;
    }

    void display() {
        System.out.println("Mobile ID: " + mobileId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("OS: " + os);
        System.out.println("Color: " + color);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Price: " + price);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("count of objects created: " + count);
    }
}