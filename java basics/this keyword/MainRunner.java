class MainRunner{
	
	public static void main(String[] args){
  
      Mirror mirror= new Mirror("Hithaishi", 2026, 26, true);
      System.out.println(mirror.print());
      System.out.println(" ");
      Movie movie= new Movie("coolie", 26, 200.0d, false);
	  System.out.println(movie.print());
      System.out.println(" ");
	  Phone phone= new Phone(8391, "blue", 32, 2);
	  System.out.println(phone.print());
      System.out.println(" ");
	  Pizza pizza= new Pizza("farmhouse", "extra cheese, corn, olives", 2, 599);
	  System.out.println(pizza.print());
      System.out.println(" ");
	  Shoes shoes= new Shoes("black", 1599, "sports", true);
	  System.out.println(shoes.print());
      System.out.println(" ");
	  Soap soap= new Soap("dove", 50, "white", 4);
	  System.out.println(soap.print());
      System.out.println(" ");
	  
}}