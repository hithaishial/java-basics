class Car {
    
    String brand;
    String model;
    int year;
    String fuelType;
    double mileage;
    String transmission;
    float price;
    String color;
    int seatingCapacity;
    boolean isElectric;
	
	static int count = 0;

    Car(String brand, String model, int year, String fuelType, double mileage, String transmission, float price, String color, int seatingCapacity, boolean isElectric) {
        this(model, year, fuelType, mileage, transmission, price, color, seatingCapacity, isElectric);
        this.brand = brand;
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Fuel: " + fuelType + ", Mileage: " + mileage + ", Transmission: " + transmission + ", Price: " + price + ", Color: " + color + ", Seats: " + seatingCapacity + ", Electric: " + isElectric);
    }

    Car(String model, int year, String fuelType, double mileage, String transmission, float price, String color, int seatingCapacity, boolean isElectric) {
        this(year, fuelType, mileage, transmission, price, color, seatingCapacity, isElectric);
        this.model = model;
        System.out.println("Model: " + model + ", Year: " + year + ", Fuel: " + fuelType + ", Mileage: " + mileage + ", Transmission: " + transmission + ", Price: " + price + ", Color: " + color + ", Seats: " + seatingCapacity + ", Electric: " + isElectric);
    }

    Car(int year, String fuelType, double mileage, String transmission, float price, String color, int seatingCapacity, boolean isElectric) {
        this(fuelType, mileage, transmission, price, color, seatingCapacity, isElectric);
        this.year = year;
        System.out.println("Year: " + year + ", Fuel: " + fuelType + ", Mileage: " + mileage + ", Transmission: " + transmission + ", Price: " + price + ", Color: " + color + ", Seats: " + seatingCapacity + ", Electric: " + isElectric);
    }

    Car(String fuelType, double mileage, String transmission, float price, String color, int seatingCapacity, boolean isElectric) {
        this(mileage, transmission, price, color, seatingCapacity, isElectric);
        this.fuelType = fuelType;
        System.out.println("Fuel: " + fuelType + ", Mileage: " + mileage + ", Transmission: " + transmission + ", Price: " + price + ", Color: " + color + ", Seats: " + seatingCapacity + ", Electric: " + isElectric);
    }

    Car(double mileage, String transmission, float price, String color, int seatingCapacity, boolean isElectric) {
        this(transmission, price, color, seatingCapacity, isElectric);
        this.mileage = mileage;
        System.out.println("Mileage: " + mileage + ", Transmission: " + transmission + ", Price: " + price + ", Color: " + color + ", Seats: " + seatingCapacity + ", Electric: " + isElectric);
    }

    Car(String transmission, float price, String color, int seatingCapacity, boolean isElectric) {
        this(price, color, seatingCapacity, isElectric);
        this.transmission = transmission;
        System.out.println("Transmission: " + transmission + ", Price: " + price + ", Color: " + color + ", Seats: " + seatingCapacity + ", Electric: " + isElectric);
    }

    Car(float price, String color, int seatingCapacity, boolean isElectric) {
        this(color, seatingCapacity, isElectric);
        this.price = price;
        System.out.println("Price: " + price + ", Color: " + color + ", Seats: " + seatingCapacity + ", Electric: " + isElectric);
    }

    Car(String color, int seatingCapacity, boolean isElectric) {
        this(seatingCapacity, isElectric);
        this.color = color;
        System.out.println("Color: " + color + ", Seats: " + seatingCapacity + ", Electric: " + isElectric);
    }

    Car(int seatingCapacity, boolean isElectric) {
        this(isElectric);
        this.seatingCapacity = seatingCapacity;
        System.out.println("Seats: " + seatingCapacity + ", Electric: " + isElectric);
    }

    Car(boolean isElectric) {
        this();
        this.isElectric = isElectric;
        System.out.println("Electric: " + isElectric);
    }

    Car() {
		count++;
        System.out.println("constructor: Car");
    }
	void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("year: " + year);
        System.out.println("Transmission: " + transmission);
        System.out.println("color: " + color);
        System.out.println("seating Capacity: " + seatingCapacity);
        System.out.println("the car is electric: " + isElectric);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("count of the objects: "+ count);
    }

}