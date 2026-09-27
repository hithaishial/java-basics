class DeliveryPartner{
	
	String partnerName;
	int experienceYears;
	Vehicle vehicle;
	
	DeliveryPartner(String partnerName, int experienceYears, Vehicle vehicle){
		
		this.partnerName = partnerName;
		this.experienceYears = experienceYears;
		this.vehicle = vehicle;
	}
	
	void display(){
		
		System.out.println("partner name: " + partnerName);
		System.out.println("experience years: " + experienceYears);
		if(vehicle != null){
			System.out.println(vehicle);
			vehicle.display();
		}
		else{
			System.out.println("the value is null");
		}
		
	}
}