class Phone{
  long model;
  String color;
  int numberOfApps;
  int numberOfSim;

  Phone(long model, String color, int numberOfApps, int numberOfSim){
	  
	  this.model= model;
	  this.color= color;
	  this.numberOfApps= numberOfApps;
	  this.numberOfSim= numberOfSim;
	  }
  public int print(){
	  
	  System.out.println("phone model is: " + model + ", color of the phone is: " + color + ", no.of apps: " + numberOfApps + ", no.of sim: " + numberOfSim);
     return 3;
}}