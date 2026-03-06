class Account {
    String email;
    String password;
    UserProfile userProfile;

    Account(String email, String password, UserProfile userProfile) {
        this.email = email;
        this.password = password;
        this.userProfile = userProfile;
    }

    void display() {
        System.out.println("Account Email: " + email + ",  password: " + password);
        if (userProfile != null) userProfile.display();
		else System.out.println("please check the value");
    }
}