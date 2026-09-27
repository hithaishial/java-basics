class Bird{
  
  String name;
  String color;
  int number;
  boolean isThere;
  
  Bird(){
  
    System.out.println("constructor: Bird");
  }
  
  Bird(String color, String nameFromConst, int number, boolean isThere){
	
	this(number, nameFromConst, isThere);
	this.color= color;
	System.out.println("the color of the bird is: " + color);
	System.out.println("the name of the bird is: " + nameFromConst);
	System.out.println("no.of bird are: " + number);
	System.out.println( isThere);
  }
  
  Bird(int number, String nameFromConst, boolean isThere){
    
	this(number, isThere); 
    name= nameFromConst;	
    System.out.println("no.of birds: "+ number);
    System.out.println("the name of the bird is: " + nameFromConst);
    System.out.println( isThere);
  }
  
  Bird(int number, boolean isThere){
	this(isThere) 
	System.out.println("no.of birds: "+ number);
    System.out.println( isThere);  
	  
  }
  
  Bird(boolean isThere){
	System.out.println( isThere);  
  }
  
}