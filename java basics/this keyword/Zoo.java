class Zoo{

  public static void main(String[] args){
  
    String[] chocolates= new String[9];
    int[] numbers= new int[6];
    char[] alphabets= new char[8];
    String[] movies= new String[5];
    String[]  animals= new String[9];
    String[] cartItems= new String[4];
    String[] shapes= new String[7]; 
	
	movies[3]= "coolie";
	animals[5]= "lion";
	
	for(int index=0; index < chocolates.length; index++){
		System.out.println(chocolates[index]);
	}
	
	for(int index=0; index < numbers.length; index++){
		System.out.println(numbers[index]);
	}
	
	for(int index=0; index < movies.length; index++){
		System.out.println(movies[index]);
	}
	
	for(int index=0; index < animals.length; index++){
		System.out.println(animals[index]);
	}
	
	for(int index=0; index < cartItems.length; index++){
		System.out.println(cartItems[index]);
	}
	
	for(int index=0; index < shapes.length; index++){
		System.out.println(shapes[index]);
  }
  
}}