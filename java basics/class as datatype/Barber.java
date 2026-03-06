class Barber{
	
	void cut(Customer customer){
		
		if(customer != null){
			System.out.println( customer);
			customer.getHaircut();
		}
		else{
			System.out.println("the value is null, please re enter the value");
		}
	}
}