class UsingSwitch{

static int number = 4; 
 
 public static void main(String[] args){

  switch (number){
    case 1:{
    System.out.println("sunday");
	break;
    }
    case 2:{
    System.out.println("monday");
	break;
    }
    case 3:{
    System.out.println("tuesday");
	break;
    }
	default: {
	System.out.println("invalid case");	
	}
  }
 }
}