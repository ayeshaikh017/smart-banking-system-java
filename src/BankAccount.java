public class BankAccount {

    int accountNumber;
    int userId;
    double balance;

    BankAccount(int accountNumber, int userId, double balance) {
        this.accountNumber = accountNumber;
        this.userId = userId;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}