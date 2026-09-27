class Phone{
static int app;
static float call;
static long screen;
static double cover;
static boolean charge;

public static void scale(){
System.out.println("running method: scale");
}
public static int bang(){
System.out.println("running method: bang");
return 15;
}
public static float man(){
System.out.println("running method: man");
return 2;
}
public static char hair(){
System.out.println("running method: hair");
return 'a';
}
public static long chain(){
System.out.println("running method: chain");
return 20;
}
public static double choco(){
System.out.println("running method: choco");
return 5;
}
public static byte flour(){
System.out.println("running method: flour");
return 15;
}
public static short book(){
System.out.println("running method: book");
return 19;
}
public static boolean isActive(){
System.out.println("running method: isActive");
return true;
}
public static String music(){
System.out.println("running method: music");
return "hello";
}
public static void main(String[] args){
scale();
int shoe= bang();
float door= man();
char page= hair();
long zip= chain();
double sharp= choco();
byte buck= flour();
short money= book();
boolean yo= isActive();
String band= music();

System.out.println(app);
System.out.println(call);
System.out.println(screen);
System.out.println(cover);
System.out.println(charge);
}
}