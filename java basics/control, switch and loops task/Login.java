class Login{
  static String dbusername = "hithaishi";
  static String dbpassword = "hitha2007";
  
  public static void loginEntry(String username, String password){

  if(dbusername.equals(username)){
	  
    if(dbpassword.equals(password)){
    
	System.out.println("login successfull");
  }
    else{
    System.out.println("invalid password");
  }}
  else{
	System.out.println("invalid username");
  }
  }
  
  public static void main(String[] args){
	 loginEntry("hitha", "hitha2007");
  }
}