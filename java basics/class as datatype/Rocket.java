class Rocket{
	
	void launch(Fuel fuel){
		
		if(fuel != null){
			System.out.println("class is used as datatype:" + fuel);
			fuel.ignite();
		}
		else System.out.println("value is null, enter new value");
	}
}