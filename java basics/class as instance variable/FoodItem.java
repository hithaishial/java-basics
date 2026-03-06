class FoodItem{
	
	String name;
	double price;
	Order order;
	
	FoodItem(String name, double price, Order order){
		
		this.name = name;
		this.price = price;
		this.order = order;
	}
	
	void display(){
		
		System.out.println("name of the food: " + name);
		System.out.println("price of the food: "+ price);
		if(order != null){
			System.out.println(order);
			order.display();
		}
		else{
			System.out.println("the value is null");
		}
		
	}
}