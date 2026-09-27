class Shop{

  void ads(Display display){
	  
	  if(display != null){
	    System.out.println("ads getting displayed: " + display);
		display.run();
	  }
	  else {
		System.out.println("value is null, please check");  
	  }
  }

}