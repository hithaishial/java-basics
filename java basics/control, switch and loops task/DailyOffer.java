class DailyOffer{
  
  static int day= 3;
  
  public static void main(String[] args){
    
	switch(day){
	   
	  case 1:{
	    
		System.out.println("Monday offer: 10% discount");
		break;
	  }
	  
	  case 2:{
	  
	    System.out.println("Tuesday offer: free delivery");
	    break;
	  }
	  
	  case 3:{
	  
	    System.out.println("Wednesday offer: Buy 1 Get 1");
	    break;
	  }
	  
	  case 4:{
	  
	    System.out.println("Thursday offer: cashback = 5%");
	    break;
	  }
	  
	  case 5:{
	    
		System.out.println("Friday offer: 15% discount");
        break;		
	  }
	  
	  case 6:{
	    
		System.out.println("Weekend mega sale");
		break;
	  }
	  
	  default:{
	    System.out.println("invalid day");
	  }
	}
  }
}