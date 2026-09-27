class District{
	
	Taluk taluk;
	Dc dc;
	
	District(Taluk taluk){
		
		this.taluk = taluk;
	}
	
	District(Dc dc){
		
		this.dc = dc;
	}
	
	display(){
		
		System.out.println("taluk: " + taluk);
		System.out.println("dc: " + dc);
	}
}