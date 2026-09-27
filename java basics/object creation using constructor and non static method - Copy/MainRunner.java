class MainRunner{
	
	public static void main(String[] args){
		
		
		Eagle eagle= new Eagle();
		Eagle eagle1= new Eagle();
		Eagle eagle2= new Eagle();
		
        System.out.println(eagle1.store());
		System.out.println(eagle2.butter());
		System.out.println(eagle);
		
		Fish fish= new Fish();
		Fish fish1= new Fish();
		Fish fish2= new Fish();
		
		System.out.println(fish1.sea());
		System.out.println(fish2.beach());
		System.out.println(fish);
		
		Galaxy galaxy=new Galaxy();		
		Galaxy galaxy1=new Galaxy();
        Galaxy galaxy2=new Galaxy();	
        
		System.out.println(galaxy1.orbit());
		System.out.println(galaxy2.asteroid());
		System.out.println(galaxy);
		
	}
}

