class Pizza{
  
  String name;
  String toppings;
  int pizzaNumber;
  int bill;
  
  Pizza(String name, String toppings, int pizzaNumber, int bill){
	  
	  this.name= name;
	  this.toppings= toppings;
	  this.pizzaNumber= pizzaNumber;
	  this.bill= bill;
	  }
  public int print(){
	  
	  System.out.println("pizza name: " + name + ", toppings are: " + toppings + ", no.of pizzas: "+ pizzaNumber + ", bill: " + bill);
	  return 4;
  }
}