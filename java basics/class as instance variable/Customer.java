class Customer{
	
	String customerName;
	String phone;
	Address address;
	
	Customer(String customerName, String phone, Address address){
		
		this.customerName = customerName;
		this.phone = phone;
		this.address = address;
	}
	
	void display(){
		
		System.out.println("customer name: " + customerName);
		System.out.println("phone: " + phone);
		if(address != null){
			System.out.println(address);
			address.display();
		}
		else{
			System.out.println("the value is null");
		}
		
	}
}