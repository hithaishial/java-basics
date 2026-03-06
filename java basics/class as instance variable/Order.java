class Order{
	
	String orderId;
	double totalAmount;
	Customer customer;
	
	Order(String orderId, double totalAmount, Customer customer){
		
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.customer = customer;
	}
	
	void display(){
		
		System.out.println("order Id: " + orderId);
		System.out.println("total amount costed: " + totalAmount);
		if(customer != null){
			System.out.println(customer);
			customer.display();
		}
		else{
			System.out.println("the value is null");
		}
		
	}
}