public class BankAccount {

    private int accountNumber;
    private int userId;
    private double balance;

    public BankAccount(int accountNumber, int userId, double balance) {
        this.accountNumber = accountNumber;
        this.userId = userId;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccount() {

        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("User ID        : " + userId);
        System.out.println("Balance        : Rs." + balance);
    }
}