class Galaxy{

  Galaxy(){
  
    System.out.println("constructor Galaxy is created");
  }
  
  public short orbit(){
  
    System.out.println("planet revolves along the orbit");
	return 2;
  }
  
  public byte asteroid(){
  
    System.out.println("an asteroid in the space");
	return 10;
  }
}