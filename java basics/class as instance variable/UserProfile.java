class UserProfile {
    String profileName;
    int age;
    Subscription subscription;

    UserProfile(String profileName, int age, Subscription subscription) {
        this.profileName = profileName;
        this.age = age;
        this.subscription = subscription;
    }

    void display() {
        System.out.println("Profile: " + profileName + ",  Age: " + age);
        if (subscription != null) subscription.display();
		else System.out.println("please check the value");
    }
}