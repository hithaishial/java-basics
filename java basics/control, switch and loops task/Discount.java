class Discount{
  static double finalAmount;
  
  public static void main(String[] args){
    discountCheck(5299d);
  }
  
  public static void discountCheck(double price){
    
   if(price>=5000){
	 finalAmount = price-(price*0.2);
     System.out.println("finalAmount is" + finalAmount);
   }
   
   else if(price>= 2000 && price<= 4999){
	 finalAmount = price-(price*0.1);  
     System.out.println("finalAmount is" + finalAmount);
   }
   
   else{
     System.out.println("no discount");
	 }
  }
}