class Mirror{
  
  String name;
  int year;
  int date;
  boolean isActive;
 
  
  Mirror(String name, int year, int date, boolean isActive){
	this.name= name;
	this.year= year;
	this.date= date;
	this.isActive= isActive;
  }
  public int print(){
	System.out.println("name: "+ name +", year: "+ year + ", date: " + date + ", isActive: " + isActive);
	return 0;
  }
  
  

}