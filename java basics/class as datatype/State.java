class State{
	
	District district;
	ChiefMinister chiefMinister;
	
	State(District district){
		this.district = district;
		
	}
	
	State(ChiefMinister chiefMinister){
		this.chiefMinister = chiefMinister;
		
	}
	
	display(){
		
		System.out.println(district);
		System.out.println(chiefMinister);
	}
	
}