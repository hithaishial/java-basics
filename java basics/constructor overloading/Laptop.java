class Laptop {
    
    String brand;
    String processor;
    int ram;
    int storage;
    float price;
    String os;
    boolean isTouchScreen;
    double screenSize;
    String color;
    int warrantyYears;
	
	static int count = 0;

    Laptop(String brand, String processor, int ram, int storage, float price, String os, boolean isTouchScreen, double screenSize, String color, int warrantyYears) {
        this(processor, ram, storage, price, os, isTouchScreen, screenSize, color, warrantyYears);
        this.brand = brand;
        System.out.println("Brand: " + brand + ", Processor: " + processor + ", RAM: " + ram + "GB, Storage: " + storage + "GB, Price: " + price + ", OS: " + os + ", Touchscreen: " + isTouchScreen + ", Screen Size: " + screenSize + " inches, Color: " + color + ", Warranty: " + warrantyYears + " years");
    }

    Laptop(String processor, int ram, int storage, float price, String os, boolean isTouchScreen, double screenSize, String color, int warrantyYears) {
        this(ram, storage, price, os, isTouchScreen, screenSize, color, warrantyYears);
        this.processor = processor;
        System.out.println("Processor: " + processor + ", RAM: " + ram + "GB, Storage: " + storage + "GB, Price: " + price + ", OS: " + os + ", Touchscreen: " + isTouchScreen + ", Screen Size: " + screenSize + " inches, Color: " + color + ", Warranty: " + warrantyYears + " years");
    }

    Laptop(int ram, int storage, float price, String os, boolean isTouchScreen, double screenSize, String color, int warrantyYears) {
        this(storage, price, os, isTouchScreen, screenSize, color, warrantyYears);
        this.ram = ram;
        System.out.println("RAM: " + ram + "GB, Storage: " + storage + "GB, Price: " + price + ", OS: " + os + ", Touchscreen: " + isTouchScreen + ", Screen Size: " + screenSize + " inches, Color: " + color + ", Warranty: " + warrantyYears + " years");
    }

    Laptop(int storage, float price, String os, boolean isTouchScreen, double screenSize, String color, int warrantyYears) {
        this(price, os, isTouchScreen, screenSize, color, warrantyYears);
        this.storage = storage;
        System.out.println("Storage: " + storage + "GB, Price: " + price + ", OS: " + os + ", Touchscreen: " + isTouchScreen + ", Screen Size: " + screenSize + " inches, Color: " + color + ", Warranty: " + warrantyYears + " years");
    }

    Laptop(float price, String os, boolean isTouchScreen, double screenSize, String color, int warrantyYears) {
        this(os, isTouchScreen, screenSize, color, warrantyYears);
        this.price = price;
        System.out.println("Price: " + price + ", OS: " + os + ", Touchscreen: " + isTouchScreen + ", Screen Size: " + screenSize + " inches, Color: " + color + ", Warranty: " + warrantyYears + " years");
    }

    Laptop(String os, boolean isTouchScreen, double screenSize, String color, int warrantyYears) {
        this(isTouchScreen, screenSize, color, warrantyYears);
        this.os = os;
        System.out.println("OS: " + os + ", Touchscreen: " + isTouchScreen + ", Screen Size: " + screenSize + " inches, Color: " + color + ", Warranty: " + warrantyYears + " years");
    }

    Laptop(boolean isTouchScreen, double screenSize, String color, int warrantyYears) {
        this(screenSize, color, warrantyYears);
        this.isTouchScreen = isTouchScreen;
        System.out.println("Touchscreen: " + isTouchScreen + ", Screen Size: " + screenSize + " inches, Color: " + color + ", Warranty: " + warrantyYears + " years");
    }

    Laptop(double screenSize, String color, int warrantyYears) {
        this(color, warrantyYears);
        this.screenSize = screenSize;
        System.out.println("Screen Size: " + screenSize + " inches, Color: " + color + ", Warranty: " + warrantyYears + " years");
    }

    Laptop(String color, int warrantyYears) {
        this(warrantyYears);
        this.color = color;
        System.out.println("Color: " + color + ", Warranty: " + warrantyYears + " years");
    }

    Laptop(int warrantyYears) {
        this();
        this.warrantyYears = warrantyYears;
        System.out.println("Warranty: " + warrantyYears + " years");
    }

    Laptop() {
        System.out.println("constructor: Laptop");
		count++;
    }
	
	void display() {
        System.out.println("Brand: " + brand);       
        System.out.println("Processor: " + processor);
        System.out.println("OS: " + os);
        System.out.println("Color: " + color);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("warranty Years: " + warrantyYears);
        System.out.println("Price: " + price);
        System.out.println("Total Laptops: " + count);
    }

	
}