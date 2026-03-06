class Hospital {
    String hospitalId;
    String name;
    String location;
    String specialization;
    String contactNumber;
    int capacity;
    int doctorsCount;
    int patientsCount;
    float rating;
    boolean isActive;

    static int count = 0;

    Hospital(String hospitalId, String name, String location, String specialization, String contactNumber, int capacity, int doctorsCount, int patientsCount,float rating, boolean isActive) {
        this(name, location, specialization, contactNumber, capacity, doctorsCount, patientsCount, rating, isActive);
        this.hospitalId = hospitalId;
        System.out.println("Hospital ID: " + hospitalId);
    }

    Hospital(String name, String location, String specialization, String contactNumber, int capacity, int doctorsCount, int patientsCount, float rating, boolean isActive) {
        this(location, specialization, contactNumber, capacity, doctorsCount, patientsCount, rating, isActive);
        this.name = name;
        System.out.println("Hospital Name: " + name);
    }

    Hospital(String location, String specialization, String contactNumber, int capacity, int doctorsCount, int patientsCount, float rating, boolean isActive) {
        this(specialization, contactNumber, capacity, doctorsCount, patientsCount, rating, isActive);
        this.location = location;
        System.out.println("Location: " + location);
    }

    Hospital(String specialization, String contactNumber, int capacity, int doctorsCount, int patientsCount, float rating, boolean isActive) {
        this(contactNumber, capacity, doctorsCount, patientsCount, rating, isActive);
        this.specialization = specialization;
        System.out.println("Specialization: " + specialization);
    }

    Hospital(String contactNumber, int capacity, int doctorsCount, int patientsCount, float rating, boolean isActive) {
        this(capacity, doctorsCount, patientsCount, rating, isActive);
        this.contactNumber = contactNumber;
        System.out.println("Contact Number: " + contactNumber);
    }

    Hospital(int capacity, int doctorsCount, int patientsCount, float rating, boolean isActive) {
        this(doctorsCount, patientsCount, rating, isActive);
        this.capacity = capacity;
        System.out.println("Capacity: " + capacity);
    }

    Hospital(int doctorsCount, int patientsCount, float rating, boolean isActive) {
        this(patientsCount, rating, isActive);
        this.doctorsCount = doctorsCount;
        System.out.println("Doctors Count: " + doctorsCount);
    }

    Hospital(int patientsCount, float rating, boolean isActive) {
        this(rating, isActive);
        this.patientsCount = patientsCount;
        System.out.println("Patients Count: " + patientsCount);
    }

    Hospital(float rating, boolean isActive) {
        this(isActive);
        this.rating = rating;
        System.out.println("Rating: " + rating);
    }

    Hospital(boolean isActive) {
        this();
        this.isActive = isActive;
        System.out.println("Is Active: " + isActive);
    }

    Hospital() {
        System.out.println("constructor: Hospital");
        count++;
    }

    void display() {
        System.out.println("Hospital ID: " + hospitalId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Specialization: " + specialization);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Capacity: " + capacity);
        System.out.println("Doctors Count: " + doctorsCount);
        System.out.println("Patients Count: " + patientsCount);
        System.out.println("Rating: " + rating);
        System.out.println("Is Active: " + isActive);
        System.out.println("Total objects created: " + count);
    }
}