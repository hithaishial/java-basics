class FoodDeliveryApp{
	
	String appName;
	double ratings;
	Restaurant restaurant;
	
	FoodDeliveryApp(String appName, double ratings, Restaurant restaurant){
		
		this.appName = appName;
		this.ratings = ratings;
		this.restaurant = restaurant;
	}
	
	void display(){
		
		System.out.println("name of the app: " + appName);
		System.out.println("ratings: " + ratings);
		if(restaurant != null){
			System.out.println(restaurant);
			restaurant.display();
		}
		else{
			System.out.println("the value is null");
		}
		
	}
}