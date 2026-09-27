class Bank{
static int money = 125;
static float otp = 7.5f;
static long upi = 20379;
static double loan = 2.839d;
static boolean fee = false;

public static void interest(){
System.out.println("running method: interest");
}
public static int atm(){
System.out.println("running method: atm");
return 15;
}
public static float locker(){
System.out.println("running method: locker");
return 2;
}
public static char camera(){
System.out.println("running method: camera");
return 'a';
}
public static long chair(){
System.out.println("running method: chair");
return 20;
}
public static double snack(){
System.out.println("running method: snack");
return 5;
}
public static byte table(){
System.out.println("running method: table");
return 15;
}
public static short book(){
System.out.println("running method: book");
return 19;
}
public static boolean inActive(){
System.out.println("running method: inActive");
return false;
}
public static String dance(){
System.out.println("running method: dance");
return "hello";
}
public static void main(String[] args){
interest();
int veg= atm();
float door= locker();
char page= camera();
long zip= chair();
double sharp= snack();
byte buck= table();
short big= book();
boolean yo= inActive();
String band= dance();

System.out.println(money);
System.out.println(otp);
System.out.println(upi);
System.out.println(loan);
System.out.println(fee);
}
}