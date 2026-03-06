class Address{
	
	String street;
	String pinCode;
	DeliveryPartner deliveryPartner;
	
	Address(String street, String pinCode, DeliveryPartner deliveryPartner){
		
		this.street = street;
		this.pinCode = pinCode;
		this.deliveryPartner = deliveryPartner;
	}
	
	void display(){
		
		System.out.println("street name: " + street);
		System.out.println("pin code: " + pinCode);
		if(deliveryPartner != null){
			System.out.println(deliveryPartner);
			deliveryPartner.display();
		}
		else{
			System.out.println("the value is null");
		}
		
	}
}