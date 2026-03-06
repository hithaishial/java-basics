class Animal{
static int cat = 23;
static float dog = 2.5f;
static long tiger=1000;
static double lion = 3.14d ;
static boolean panda = true;

public static void snake(){
System.out.println("running method: snake");
}
public static int frog(){
System.out.println("running method: frog");
return 125;
}
public static float small(){
System.out.println("running method: small");
return 220;
}
public static char rabbit(){
System.out.println("running method: rabbit");
return 'A';
}
public static long rat(){
System.out.println("running method: rat");
return 5678;
}
public static double bat(){
System.out.println("running method: bat");
return 248;
}
public static byte eat(){
System.out.println("running method: eat");
return 101;
}
public static short horse(){
System.out.println("running method: horse");
return 7;
}
public static boolean cow(){
System.out.println("running method: cow");
return true;
}
public static String donkey(){
System.out.println("running method: donkey");
return "hi";
}
public static void main(String[] args){
snake();
int shoe= frog();
float door= small();
char page= rabbit();
long zip= rat();
double sharp= bat();
byte buck= eat();
short money= horse();
boolean yo= cow();
String band= donkey();
System.out.println(cat);
System.out.println(dog);
System.out.println(tiger);
System.out.println(lion);
System.out.println(panda);
}
}