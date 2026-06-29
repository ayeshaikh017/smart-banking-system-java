public class Transaction {

    int transactionId;
    int accountNumber;
    String type;
    double amount;

    Transaction(int transactionId, int accountNumber, String type, double amount) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
    }

    void displayTransaction() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Type: " + type);
        System.out.println("Amount: ₹" + amount);
    }
}