class PaymentMode{

  static String mode = "COD";
  
  public static void main(String[] args){
    
	switch(mode){
	
	  case "UPI":{
	    System.out.println("Redirecting to UPI Gateway");
		break;
	  }
	  
	  case "CARD":{
	    System.out.println("Proccessing card payment");
		break;
	  }
	  
	  case "NET BANKING":{
	    System.out.println("redirecting to bank");
		break;
	  }
	  
	  case "COD":{
	    System.out.println("cash on delivery selected");
		break;
	  }
	  
	  default:{
	    System.out.println("invalid payment mode");
	  }
	}
  }
}