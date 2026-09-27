class Login{
  static String username = "hithaishi";
  static String password = "hitha2007";
  
  public static void main loginEntry(){

  if(username =!"hithaishi"){
    
	System.out.println("invalid username");
	}
	
  else if(password =! "hitha2007"){
    
	System.out.println("invalid password");
	}
  else if(password == "hitha2007" && username == "hithaishi"){
    System.out.println("login successfull");
	}
  }
}