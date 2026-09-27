class RoleAccess{
  static String role= "USER";
  
    public static void main(String[] args){
	 
	 switch(role){
		 
      case "ADMIN": {
	   System.out.println("full syastem access");
	   break;
	  }
	  
	  case "MANAGER":{
	   System.out.println("manage team access");
	   break;
	  } 
	 
	  case "USER":{
	   System.out.println("limited access");
	   break;
	  }
	  
	  case "GUEST":{
	   System.out.println("view only access");
	   break;
	  }
	  
	  default:{
	   System.out.println("invalid role");
	  }
	 }
	  
	}
}