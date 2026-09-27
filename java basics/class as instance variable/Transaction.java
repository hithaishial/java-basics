class Transaction {
    String transactionId;
    String status;
    ContentLibrary contentLibrary;

    Transaction(String transactionId, String status, ContentLibrary contentLibrary) {
        this.transactionId = transactionId;
        this.status = status;
        this.contentLibrary = contentLibrary;
    }

    void display() {
        System.out.println("Transaction ID: " + transactionId + "  Status: " + status);
        if (contentLibrary != null) contentLibrary.display();
		else System.out.println("please enter the value");
    }
}