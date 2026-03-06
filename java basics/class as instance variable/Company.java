class Company{
	
	String companyName;
	String headquaters;
	int employees;
	
	Company(String companyName,String headquaters,int employees){
		
		this.companyName = companyName;
		this.headquaters = headquaters;
		this.employees = employees;
	}
	
	void display(){
		System.out.println("company name: "  + companyName);
		System.out.println("headquaters: " + headquaters);
		System.out.println("no.of employees: " + employees);
	}
}