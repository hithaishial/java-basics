class Menu{
	
	String menuType;
	int totalItems;
	FoodItem foodItem;
	
	Menu(String menuType, int totalItems, FoodItem foodItem){
		
		this.menuType = menuType;
		this.totalItems = totalItems;
		this.foodItem = foodItem;
		
	}
	
	void display(){
		
		System.out.println("menu type: " + menuType);
		System.out.println("total no.of items: " + totalItems);
		if(foodItem != null){
			System.out.println(foodItem);
			foodItem.display();
		}
		else{
			System.out.println("the value is null");
		}
		
	}
}