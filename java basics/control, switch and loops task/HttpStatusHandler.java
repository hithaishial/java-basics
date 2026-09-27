class HttpStatusHandler{
  
  static int statusCode = 401;
  
  public static void main(String[] args){
  
    switch(statusCode){
	
	  case 200:{
	    System.out.println("OK - request successful");
		break;
	  }
	  
	  case 201:{
	    System.out.println("created successfully");
		break;
	  }
	  
	  case 400:{
	    System.out.println("bad request");
		break;
	  }
	  
	  case 401:{
	    System.out.println("unauthorised access");
		break;
	  }
	  
	  case 500:{
	    System.out.println("internal server error");
		break;
	  }
	  
	  default:{
	    System.out.println("invalid status code");
	  }
	}
  }
}