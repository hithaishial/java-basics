class BankAccount{
  
  String accountNumber;
  String holderName;
  String accountType;
  double balance;
  String branchName;
  String ifscCode;
  String email;
  long phoneNumber;
  boolean isActive;
  String openingDate;
  
  static int count = 0;
  
  BankAccount(String accountNumber, String holderName, String accountType, double balance, String branchName, String ifscCode, String email, long phoneNumber, boolean isActive, String openingDate){
	  
	  this(holderName, accountType, balance, branchName, ifscCode, email, phoneNumber, isActive, openingDate);
	  this.accountNumber = accountNumber;
	  System.out.println("acc number: " + accountNumber + " holder name: " + holderName + " type of acc: " + accountType + " balance: " + balance + "branch name: " + branchName + "IFSC code: " + ifscCode + " email: " + email + " phone number: " + phoneNumber + " is active: " + isActive + " opening date: " + openingDate);
  }
  
  BankAccount(String holderName, String accountType, double balance, String branchName, String ifscCode, String email, long phoneNumber, boolean isActive, String openingDate){
	  
	  this(accountType, balance, branchName, ifscCode, email, phoneNumber,isActive, openingDate);
	  this.holderName = holderName;
	  System.out.println("holder name: " + holderName + " type of acc: " + accountType + " balance: " + balance + "branch name: " + branchName + " IFSC code: " + ifscCode + " email: " + email + " phone number: " + phoneNumber + " is active: " + isActive + " opening date: " + openingDate);
  }
  
  BankAccount(String accountType, double balance, String branchName, String ifscCode, String email, long phoneNumber, boolean isActive, String openingDate){
	  
	  this(balance, branchName, ifscCode, email, phoneNumber,isActive, openingDate);
	  this.accountType = accountType;
	  System.out.println(" type of acc: " + accountType + " balance: " + balance + "branch name: " + branchName + " IFSC code: " + ifscCode + " email: " + email + " phone number: " + phoneNumber + " is active: " + isActive + " opening date: " + openingDate);
  }
  
  BankAccount(double balance, String branchName, String ifscCode, String email, long phoneNumber, boolean isActive, String openingDate){
	  
	  this(branchName, ifscCode, email, phoneNumber,isActive, openingDate);
	  this.balance = balance;
	  System.out.println(" balance: " + balance + "branch name: " + branchName + " IFSC code: " + ifscCode + " email: " + email + " phone number: " + phoneNumber + " is active: " + isActive + " opening date: " + openingDate);
  }
  
  BankAccount(String branchName, String ifscCode, String email, long phoneNumber, boolean isActive, String openingDate){
	  
	  this(ifscCode, email, phoneNumber,isActive, openingDate);
	  this.branchName = branchName;
	  System.out.println("branch name: " + branchName + " IFSC code: " + ifscCode + " email: " + email + " phone number: " + phoneNumber + " is active: " + isActive + " opening date: " + openingDate);
  }
  
  BankAccount(String ifscCode, String email, long phoneNumber, boolean isActive, String openingDate){
	  
	  this(email, phoneNumber,isActive, openingDate);
	  this.ifscCode = ifscCode;
	  System.out.println(" IFSC code: " + ifscCode + " email: " + email + " phone number: " + phoneNumber + " is active: " + isActive + " opening date: " + openingDate);
  }
  
  BankAccount(String email, long phoneNumber, boolean isActive, String openingDate){
	  
	  this(phoneNumber,isActive, openingDate);
	  this.email = email;
	  System.out.println(" email: " + email + " phone number: " + phoneNumber + " is active: " + isActive + " opening date: " + openingDate);
  }
  
  BankAccount(long phoneNumber, boolean isActive, String openingDate){
	  
	  this(isActive, openingDate);
	  this.phoneNumber = phoneNumber;
	  System.out.println(" phone number: " + phoneNumber + " is active: " + isActive + " opening date: " + openingDate);
  }
  
  
  BankAccount(boolean isActive, String openingDate){
	  
	  this(openingDate);
	  this.isActive = isActive;
	  System.out.println(" is active: " + isActive + " opening date: " + openingDate);
  }
  
  BankAccount(String openingDate){

	  this();
	  System.out.println(" opening date: " + openingDate);
  }
  
  BankAccount(){
	  
	  System.out.println("constructor: BankAccount");
	  count++;
  }
  
  void display(){
	  System.out.println("Account Number: " + accountNumber);
	  System.out.println("Holder name: " + holderName);
	  System.out.println("Account type: " + accountType);
	  System.out.println("balance is: " + balance);
	  System.out.println("Branch name is: " + branchName);
	  System.out.println("IFSC code is: " + ifscCode);
	  System.out.println("email is: " + email);
	  System.out.println("phone number is: " + phoneNumber);
	  System.out.println("isActive: " + isActive);
	  System.out.println("opening date: " + openingDate);
	  System.out.println("count of objects is: " + count);
	  
  }
  
  
  

}