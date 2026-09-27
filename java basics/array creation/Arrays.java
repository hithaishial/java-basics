class Arrays{
	
	public static void main(String[] args){
		
		int[] numbers = {2, 5, 8, 3, 9, 5, 0, 4, 6};
		int[] numbers1 = new int[9];
		numbers[4] = 1;
		
		for(int number:numbers){
			
			System.out.println(number);
		}
		
		System.out.println("   ");
		System.out.println("   ");
		
		byte[] values = {1, 0, 2};
		byte[] values1 = new byte[3];
		
		for(byte value: values){
			
			System.out.println(value);
		}
		
		System.out.println("   ");
		System.out.println("   ");
		
		short[] marks = {12, 15, 20, 36, 38, 29, 23};
		short[] marks1 = new short[7];
		marks[4] = 25;
		
		for(short mark: marks){
			
			System.out.println(mark);
		}
		
		System.out.println("   ");
		System.out.println("   ");
		
		char[] grades = {'A', 'B', 'C', 'D', 'E'};
		char[] grades1 = new char[5];
		grades[4] = 'F';
		grades[3] = 'G';
		
		for(char grade: grades){
			
			System.out.println(grade);
		}
		
		System.out.println("   ");
		System.out.println("   ");
		
		long[] orderOfCustomers = {4, 15, 37, 12, 2, 9, 11, 23, 5, 8, 45};
		long[] orderOfCustomers1 = new long[11];
		orderOfCustomers[8] = 10;
		
		for(long orderOfCustomer: orderOfCustomers){
			
			System.out.println(orderOfCustomer);
		}
		
		System.out.println("   ");
		System.out.println("   ");
		
		float[] decimals = {1.8f, 2.3f, 2.1f, 3.1f, 4.5f};
		float[] decimals1 = new float[5];
		decimals[0] = 2.2f;
		
		for(float decimal: decimals){
			
			System.out.println(decimal);
		}
		
		System.out.println("   ");
		System.out.println("   ");
		
		boolean[] outcomes = {true, false, false, false, true, false};
		boolean[] outcomes1 = new boolean[6];
		outcomes[3] = true;
		
		for(boolean outcome: outcomes){
			
			System.out.println(outcome);
		}
		
		System.out.println("   ");
		System.out.println("   ");
		
		String[] names = {"mary", "cristopher", "emily", "jack", "taylor", "pablo", "stephen"};
		String[] names1 = new String[7];
		names[6] = "daniel";
		
		for(String name: names){
			
			System.out.println(name);
		}
		
		System.out.println("   ");
		System.out.println("   ");
		
		double[] prices = {124.45, 786.68, 3874.62, 354.8, 4532.44};
		double[] prices1 = new double[5];
		prices[3]= 1008.25;
		
		for(double price: prices){
			
			System.out.println(price);
		}
		
		System.out.println("   ");
		System.out.println("   ");
		
		String[] groceryItems = {"cheese", "ketchup", "atta", "paneer", "pizza sauce", "cocoa powder", "milk"};
		String[] groceryItems1 = new String[7];
		
		for(String groceryItem: groceryItems){
			
			System.out.println(groceryItem);
		}
		
		System.out.println("   ");
		System.out.println("   ");
		
		double[] movieRatings = {2.4, 4.9, 3.5, 5.0, 4.4, 3.1};
		double[] movieRatings1 = new double[6];
		
		for(double movieRating: movieRatings){
			
			System.out.println(movieRating);
		}
		
	}
}