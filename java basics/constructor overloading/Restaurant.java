class Restaurant {
    
    String restaurantId;
    String name;
    String location;
    String cuisineType;
    int seatingCapacity;
    float rating;
    String contactNumber;
    boolean isOpenNow;
    String ownerName;
    int establishedYear;
	
	static int count = 0;

    Restaurant(String restaurantId, String name, String location, String cuisineType, int seatingCapacity, float rating, String contactNumber, boolean isOpenNow, String ownerName, int establishedYear) {
        this(name, location, cuisineType, seatingCapacity, rating, contactNumber, isOpenNow, ownerName, establishedYear);
        this.restaurantId = restaurantId;
        System.out.println("RestaurantId: " + restaurantId + ", Name: " + name + ", Location: " + location + ", Cuisine: " + cuisineType + ", Seats: " + seatingCapacity + ", Rating: " + rating + ", Contact: " + contactNumber + ", OpenNow: " + isOpenNow + ", Owner: " + ownerName + ", Established: " + establishedYear);
    }

    Restaurant(String name, String location, String cuisineType, int seatingCapacity, float rating, String contactNumber, boolean isOpenNow, String ownerName, int establishedYear) {
        this(location, cuisineType, seatingCapacity, rating, contactNumber, isOpenNow, ownerName, establishedYear);
        this.name = name;
        System.out.println("Name: " + name + ", Location: " + location + ", Cuisine: " + cuisineType + ", Seats: " + seatingCapacity + ", Rating: " + rating + ", Contact: " + contactNumber + ", OpenNow: " + isOpenNow + ", Owner: " + ownerName + ", Established: " + establishedYear);
    }

    Restaurant(String location, String cuisineType, int seatingCapacity, float rating, String contactNumber, boolean isOpenNow, String ownerName, int establishedYear) {
        this(cuisineType, seatingCapacity, rating, contactNumber, isOpenNow, ownerName, establishedYear);
        this.location = location;
        System.out.println("Location: " + location + ", Cuisine: " + cuisineType + ", Seats: " + seatingCapacity + ", Rating: " + rating + ", Contact: " + contactNumber + ", OpenNow: " + isOpenNow + ", Owner: " + ownerName + ", Established: " + establishedYear);
    }

    Restaurant(String cuisineType, int seatingCapacity, float rating, String contactNumber, boolean isOpenNow, String ownerName, int establishedYear) {
        this(seatingCapacity, rating, contactNumber, isOpenNow, ownerName, establishedYear);
        this.cuisineType = cuisineType;
        System.out.println("Cuisine: " + cuisineType + ", Seats: " + seatingCapacity + ", Rating: " + rating + ", Contact: " + contactNumber + ", OpenNow: " + isOpenNow + ", Owner: " + ownerName + ", Established: " + establishedYear);
    }

    Restaurant(int seatingCapacity, float rating, String contactNumber, boolean isOpenNow, String ownerName, int establishedYear) {
        this(rating, contactNumber, isOpenNow, ownerName, establishedYear);
        this.seatingCapacity = seatingCapacity;
        System.out.println("Seats: " + seatingCapacity + ", Rating: " + rating + ", Contact: " + contactNumber + ", OpenNow: " + isOpenNow + ", Owner: " + ownerName + ", Established: " + establishedYear);
    }

    Restaurant(float rating, String contactNumber, boolean isOpenNow, String ownerName, int establishedYear) {
        this(contactNumber, isOpenNow, ownerName, establishedYear);
        this.rating = rating;
        System.out.println("Rating: " + rating + ", Contact: " + contactNumber + ", OpenNow: " + isOpenNow + ", Owner: " + ownerName + ", Established: " + establishedYear);
    }

    Restaurant(String contactNumber, boolean isOpenNow, String ownerName, int establishedYear) {
        this(isOpenNow, ownerName, establishedYear);
        this.contactNumber = contactNumber;
        System.out.println("Contact: " + contactNumber + ", OpenNow: " + isOpenNow + ", Owner: " + ownerName + ", Established: " + establishedYear);
    }

    Restaurant(boolean isOpenNow, String ownerName, int establishedYear) {
        this(ownerName, establishedYear);
        this.isOpenNow = isOpenNow;
        System.out.println("OpenNow: " + isOpenNow + ", Owner: " + ownerName + ", Established: " + establishedYear);
    }

    Restaurant(String ownerName, int establishedYear) {
        this(establishedYear);
        this.ownerName = ownerName;
        System.out.println("Owner: " + ownerName + ", Established: " + establishedYear);
    }

    Restaurant(int establishedYear) {
        this();
        this.establishedYear = establishedYear;
        System.out.println("Established: " + establishedYear);
    }

    Restaurant() {
		count++;
        System.out.println("constructor: Restaurant");
    }
	
	void display() {
    System.out.println("Restaurant ID: " + restaurantId);
    System.out.println("Name: " + name);
    System.out.println("Location: " + location);
    System.out.println("Cuisine Type: " + cuisineType);
    System.out.println("Seating Capacity: " + seatingCapacity);
    System.out.println("Rating: " + rating);
    System.out.println("Contact Number: " + contactNumber);
    System.out.println("Is Open Now: " + isOpenNow);
    System.out.println("Owner Name: " + ownerName);
    System.out.println("Established Year: " + establishedYear);
	System.out.println("count: " +count);
}
}

