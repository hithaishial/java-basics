class Vehicle{
	
	String vehicleType;
	String vehicleNumber;
	Company company;
	
	Vehicle(String vehicleType, String vehicleNumber, Company company){
		
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.company = company;
	}
	
	void display(){
		
		System.out.println("vehicle type: " + vehicleType);
		System.out.println("vehicle number: " + vehicleNumber);
		if(company != null){
			System.out.println(company);
			company.display();
		}
		else{
			System.out.println("the value is null");
		}
		
	}
}