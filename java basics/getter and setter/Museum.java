class Museum{
	
	private String museumName;
    private String location;
    private int establishedYear;
    private long collectionSize;
    private String famousExhibit;
    private int visitorCapacity;
    private double ticketPrice;
	
	public void setMuseumName(String museumName){
		
		this.museumName = museumName;
	}
	public String getMuseumName(){
		
		return museumName;
	}
	public void setLocation(String location){
		
		this.location = location;
	}
	public String getLocation(){
		
		return location;
	}
	public void setEstablishedYear(int establishedYear){
		
		this.establishedYear = establishedYear;
	}
	public String getEstablishedYear(){
		
		return establishedYear;
	}
	public void setFamousExhibit(String famousExhibit){
		
		this.famousExhibit = famousExhibit;
	}
	public String getFamousExhibit(){
		
		return famousExhibit;
	}
    public void setVistorCapacity(int visitorCapacity){
		
		this.visitorCapacity = visitorCapacity;
	}
	public String getVisitorCapacity(){
		
		return visitorCapacity;
	}
	public void setTicketPrice(double ticketPrice){
		
		this.ticketPrice = ticketPrice;
	}
	public String getTicketPrice(){
		
		return ticketPrice;
	}




}