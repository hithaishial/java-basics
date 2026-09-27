class Soap{
	
	String brand;
	int price;
	String color;
	int number;
	
	Soap(String brand, int price, String color, int number){
		
		this.brand= brand;
		this.price= price;
		this.color= color;
		this.number= number;
		
}
    public int print(){
		
		System.out.println("soap brand: " + brand + ", price of the soap: " + price + ", color of the soap: " + color + ", no.of soaps: " + number);
		return 6;
	}
	
	
}