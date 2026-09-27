class Burger{
	
 	int burgerCount;
	double price;
	String burgerName;
	int calories;
	int total;
	
	static int count = 0;
	
	Burger(){
		System.out.println("no args const");
		count++;
	}
	
	Burger(int burgerCount, double price, String burgerName, int calories, int total){
		this(price, burgerName, calories, total);
		this.burgerName=burgerName;		
		System.out.println("const with 5 parms");
		count++;
	}
	
	Burger(double price, String burgerName, int calories, int total){
		this(calories, total);
		this.burgerCount= burgerCount;
		this.price = price;
		this.calories = calories;
		System.out.println("const with 4 parms");
	}
	
	Burger(int calories, int total){
		this(total);
		this.calories = calories;
		System.out.println("const with 2 parms");
	}
	
	

	Burger(int total){
		this();
		this.total=total;
		System.out.println("const with 1 parms");
	}
	
	void display(){
		System.out.println("Burger count :"+burgerCount);
		System.out.println("burger price: " + price);
		System.out.println("Burger Name :"+ burgerName);
		System.out.println("calories: " + calories);
		System.out.println("Burger total :"+ total);
		System.out.println("count: " + count);
	}	
}