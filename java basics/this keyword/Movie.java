class Movie{
	
  String movieName;
  int date;
  double ticketPrice;
  boolean isAvailable;
 
  
  Movie(String movieName, int date, double ticketPrice, boolean isAvailable){
	this.movieName= movieName;
	this.ticketPrice= ticketPrice;
	this.date= date;
	this.isAvailable= isAvailable;
	}
  public int print(){
	System.out.println("movieName: "+ movieName +", date: "+ date + ", ticketPrice: " + ticketPrice + ", isAvailable: " + isAvailable);
	return 2;
  }
	
	
}