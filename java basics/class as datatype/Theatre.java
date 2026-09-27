class Theatre{
	
	void show(Poster poster){
		
		if(poster != null){
			System.out.println("the poster is of the movie: " + poster);
			poster.showInfo();
		}
		else{
			System.out.println("the value null, re enter the value");
		}
	}

}