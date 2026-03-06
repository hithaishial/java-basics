class Shoes{
	
	String color;
	int price;
	String type;
	boolean isExist;
	
	Shoes(String color, int price, String type, boolean isExist){
		
		this.color= color;
		this.price= price;
		this.type= type;
		this.isExist= isExist;
}
    public int print(){
		
		System.out.println("color of the shoes: " + color + ", price of shoes: " + price + ", type of the shoes: " + type + ", the shoes exist: " + isExist);
	    return 5;

	}
	
}