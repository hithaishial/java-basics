class Restaurant{
	
	String restaurantName;
	String cuisine;
	Menu menu;
	
	Restaurant(String restaurantName, String cuisine, Menu menu){
		
		this.restaurantName = restaurantName;
		this.cuisine = cuisine;
		this.menu = menu;
		
	}
	
	void display(){
		
		System.out.println("name of the restaurant: " + restaurantName);
		System.out.println("cuisine name: " + cuisine);
		
		if(menu != null){
		    System.out.println(menu);
		}
		
		else {
			System.out.println("please enter value other than null");
		}
	}
}