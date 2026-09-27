class Subscription {
    String planName;
    double monthlyPrice;
    Payment payment;

    Subscription(String planName, double monthlyPrice, Payment payment) {
        this.planName = planName;
        this.monthlyPrice = monthlyPrice;
        this.payment = payment;
    }

    void display() {
        System.out.println("Subscription Plan: " + planName + " | Price: " + monthlyPrice);
        if (payment != null) payment.display();
		else System.out.println("please check the value");
    }
}