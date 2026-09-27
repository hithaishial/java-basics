class SmartWatch {
    String watchId;
    String brand;
    String model;
    String os;
    String color;
    String features;
    int batteryLife;
    int releaseYear;
    double price;
    boolean isAvailable;

    static int count = 0;

    SmartWatch(String watchId, String brand, String model, String os, String color, String features, int batteryLife, int releaseYear, double price, boolean isAvailable) {
        this(brand, model, os, color, features, batteryLife, releaseYear, price, isAvailable);
        this.watchId = watchId;
        System.out.println("Watch ID: " + watchId);
    }

    SmartWatch(String brand, String model, String os, String color, String features, int batteryLife, int releaseYear, double price, boolean isAvailable) {
        this(model, os, color, features, batteryLife, releaseYear, price, isAvailable);
        this.brand = brand;
        System.out.println("Brand: " + brand);
    }

    SmartWatch(String model, String os, String color, String features, int batteryLife, int releaseYear, double price, boolean isAvailable) {
        this(os, color, features, batteryLife, releaseYear, price, isAvailable);
        this.model = model;
        System.out.println("Model: " + model);
    }

    SmartWatch(String os, String color, String features, int batteryLife, int releaseYear, double price, boolean isAvailable) {
        this(color, features, batteryLife, releaseYear, price, isAvailable);
        this.os = os;
        System.out.println("OS: " + os);
    }

    SmartWatch(String color, String features, int batteryLife, int releaseYear, double price, boolean isAvailable) {
        this(features, batteryLife, releaseYear, price, isAvailable);
        this.color = color;
        System.out.println("Color: " + color);
    }

    SmartWatch(String features, int batteryLife, int releaseYear,
               double price, boolean isAvailable) {
        this(batteryLife, releaseYear, price, isAvailable);
        this.features = features;
        System.out.println("Features: " + features);
    }

    SmartWatch(int batteryLife, int releaseYear, double price, boolean isAvailable) {
        this(releaseYear, price, isAvailable);
        this.batteryLife = batteryLife;
        System.out.println("Battery Life: " + batteryLife + " hours");
    }

    SmartWatch(int releaseYear, double price, boolean isAvailable) {
        this(price, isAvailable);
        this.releaseYear = releaseYear;
        System.out.println("Release Year: " + releaseYear);
    }

    SmartWatch(double price, boolean isAvailable) {
        this(isAvailable);
        this.price = price;
        System.out.println("Price: " + price);
    }

    SmartWatch(boolean isAvailable) {
        this();
        this.isAvailable = isAvailable;
        System.out.println("Is Available: " + isAvailable);
    }

    SmartWatch() {
        System.out.println("constructor: SmartWatch");
        count++;
    }

    void display() {
        System.out.println("Watch ID: " + watchId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("OS: " + os);
        System.out.println("Color: " + color);
        System.out.println("Features: " + features);
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Price: " + price);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Total SmartWatches created: " + count);
    }
}