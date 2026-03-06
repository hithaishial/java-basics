class Payment {
    String paymentMethod;
    double amount;
    Transaction transaction;

    Payment(String paymentMethod, double amount, Transaction transaction) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.transaction = transaction;
    }

    void display() {
        System.out.println("Payment Method: " + paymentMethod + ",  Amount: " + amount);
        if (transaction != null) transaction.display();
		else System.out.println("please check the value");
    }
}