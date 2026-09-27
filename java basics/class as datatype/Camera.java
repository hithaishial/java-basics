class Camera{
	void capture(Lens lens){
		if(lens != null){
			System.out.println("captured: " + lens);
			lens.focus();
		}
		else{
			System.out.println("the value is null, please re enter the value");
		}
	}
  
}