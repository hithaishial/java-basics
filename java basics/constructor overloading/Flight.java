class Flight {
    String flightId;
    String flightNumber;
    String airline;
    String source;
    String destination;
    String type;
    int capacity;
    int durationMinutes;
    double fare;
    boolean isActive;

    static int count = 0;

    Flight(String flightId, String flightNumber, String airline, String source, String destination, String type, int capacity, int durationMinutes, double fare, boolean isActive) {
        this(flightNumber, airline, source, destination, type, capacity, durationMinutes, fare, isActive);
        this.flightId = flightId;
        System.out.println("Flight ID: " + flightId);
    }

    Flight(String flightNumber, String airline, String source, String destination, String type, int capacity, int durationMinutes, double fare, boolean isActive) {
        this(airline, source, destination, type, capacity, durationMinutes, fare, isActive);
        this.flightNumber = flightNumber;
        System.out.println("Flight Number: " + flightNumber);
    }

    Flight(String airline, String source, String destination, String type, int capacity, int durationMinutes, double fare, boolean isActive) {
        this(source, destination, type, capacity, durationMinutes, fare, isActive);
        this.airline = airline;
        System.out.println("Airline: " + airline);
    }

    Flight(String source, String destination, String type, int capacity, int durationMinutes, double fare, boolean isActive) {
        this(destination, type, capacity, durationMinutes, fare, isActive);
        this.source = source;
        System.out.println("Source: " + source);
    }

    Flight(String destination, String type, int capacity, int durationMinutes, double fare, boolean isActive) {
        this(type, capacity, durationMinutes, fare, isActive);
        this.destination = destination;
        System.out.println("Destination: " + destination);
    }

    Flight(String type, int capacity, int durationMinutes, double fare, boolean isActive) {
        this(capacity, durationMinutes, fare, isActive);
        this.type = type;
        System.out.println("Type: " + type);
    }

    Flight(int capacity, int durationMinutes, double fare, boolean isActive) {
        this(durationMinutes, fare, isActive);
        this.capacity = capacity;
        System.out.println("Capacity: " + capacity);
    }

    Flight(int durationMinutes, double fare, boolean isActive) {
        this(fare, isActive);
        this.durationMinutes = durationMinutes;
        System.out.println("Duration: " + durationMinutes + " minutes");
    }

    Flight(double fare, boolean isActive) {
        this(isActive);
        this.fare = fare;
        System.out.println("Fare: " + fare);
    }

    Flight(boolean isActive) {
        this();
        this.isActive = isActive;
        System.out.println("Is Active: " + isActive);
    }

    Flight() {
        System.out.println("constructor: Flight");
        count++;
    }

    void display() {
        System.out.println("Flight ID: " + flightId);
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Airline: " + airline);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity);
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Fare: " + fare);
        System.out.println("Is Active: " + isActive);
        System.out.println("Total Flights created: " + count);
    }
}