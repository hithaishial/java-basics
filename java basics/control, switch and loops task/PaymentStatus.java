class PaymentStatus{
  static String status= "success";

 public static void main(String[] args){
   statusCheck();
  }
  
 public static void statusCheck(){
   if(status == "success"){
     System.out.println("ORDER CONFIRMED");
   }
   
   else if(status == "failed"){
     System.out.println("TRANSACTION FAILED");
   } 
   
   else if(status == "pending"){
     System.out.println("AWAITING PAYMENT CONFIRMATION");
   }
 }   
}