class MainRunner{
	
	public static void main(String[] args){
		
		Company company = new Company("elite", "delhi", 328435);
		Vehicle vehicle = new Vehicle("bike", "4793", company);
		DeliveryPartner deliveryPartner = new DeliveryPartner("somanath", 8, vehicle);
		Address address = new Address("christ street", "560089", deliveryPartner);
		Customer customer = new Customer("hithaishi", "8296844243", address);
		Order order = new Order("j445", 100, customer);
		FoodItem foodItem = new FoodItem("masala dose", 90, order);
		Menu menu = new Menu("veg", 57, foodItem);
		Restaurant restaurant = new Restaurant("udupi grand", "south indian", menu);
		FoodDeliveryApp foodDeliveryApp = new FoodDeliveryApp("swiggy", 4.3d, null);
		
		
		
		foodDeliveryApp.display();
		
		System.out.println(" ");
		
		Episode episode = new Episode("Pilot Episode", 45);
        Series series = new Series("Stranger Things", 4, episode);
        Movie movie = new Movie("Inception", "Sci-Fi", series);
        ContentLibrary contentLibrary = new ContentLibrary("Premium Library", 5000, movie);
        Transaction transaction = new Transaction("T12345", "Success", contentLibrary);
        Payment payment = new Payment("Credit Card", 15.99, transaction);
        Subscription subscription = new Subscription("Premium Plan", 15.99, payment);
        UserProfile userProfile = new UserProfile("Hithaishi", 22, subscription);
        Account account = new Account("hithaishi@gmail.com", "123", userProfile);
        StreamingPlatform streamingPlatform = new StreamingPlatform("Netflix", 4.8, account);
		
		streamingPlatform.display();

		
	}
}