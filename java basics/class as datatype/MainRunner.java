class MainRunner{
  
  public static void main(String[] args){
  
    Shop shop = new Shop();
	Display display = new Display();
	shop.ads(null);
	
	System.out.println(" ");
	
	Theatre theatre = new Theatre();
	Poster poster = new Poster();
	theatre.show(poster);
	
	System.out.println(" ");
	
	Rocket rocket = new Rocket();
	Fuel fuel = new Fuel();
	rocket.launch(fuel);
	
	System.out.println(" ");
	
	Camera camera = new Camera();
	Lens lens = new Lens();
	camera.capture(null);
	
	System.out.println(" ");
	
	Barber barber = new Barber();
	Customer customer = new Customer();
	barber.cut(customer);
	
	
  }
}