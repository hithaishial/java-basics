class StreamingPlatform {
    
	String platformName;
    double rating;
    Account account;

    StreamingPlatform(String platformName, double rating, Account account) {
        this.platformName = platformName;
        this.rating = rating;
        this.account = account;
    }

    void display() {
        System.out.println("Platform: " + platformName + ",  Rating: " + rating);
        if (account != null){ 
		    account.display();
		}
		else{
			System.out.println("please check the value");
		}
		
    }
}