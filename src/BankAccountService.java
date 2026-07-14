import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountService {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    private static int nextAccountNumber = 100001;

    public BankAccount createAccount(int userId) {

        BankAccount account =
                new BankAccount(nextAccountNumber++, userId, 0);

        accounts.add(account);

        return account;
    }

    public void displayAllAccounts() {

        if (accounts.isEmpty()) {

            System.out.println("No accounts found.");
            return;
        }

        for (BankAccount account : accounts) {

            account.displayAccount();
        }
    }
    public void deposit(int accountNumber, double amount) {

    for (BankAccount account : accounts) {

        if (account.getAccountNumber() == accountNumber) {

            account.setBalance(account.getBalance() + amount);

            System.out.println("\nDeposit Successful!");
            System.out.println("Updated Balance : Rs. " + account.getBalance());

            return;
        }
    }

    System.out.println("Account Not Found!");
}

// Withdraw Money
public void withdrawMoney(Scanner sc) {

    System.out.println("\n===== WITHDRAW MONEY =====");

    System.out.print("Enter Account Number : ");
    int accountNumber = sc.nextInt();

    // Search Account
    for (BankAccount account : accounts) {

        if (account.getAccountNumber() == accountNumber) {

            System.out.print("Enter Withdraw Amount : Rs.");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                System.out.println("Invalid Withdraw Amount.");
                return;
            }

            if (amount > account.getBalance()) {
                System.out.println("Insufficient Balance.");
                return;
            }

            double newBalance = account.getBalance() - amount;

            account.setBalance(newBalance);

            System.out.println("\nAmount Withdrawn Successfully!");
            System.out.println("Remaining Balance : Rs." + account.getBalance());

            return;
        }
    }

    System.out.println("Account Not Found.");
}
// Transfer Money
public void transferMoney(Scanner sc) {

    System.out.println("\n===== TRANSFER MONEY =====");

    System.out.print("Enter Sender Account Number : ");
    int senderAcc = sc.nextInt();

    System.out.print("Enter Receiver Account Number : ");
    int receiverAcc = sc.nextInt();

    if (senderAcc == receiverAcc) {
        System.out.println("Sender and Receiver Account cannot be the same.");
        return;
    }

    BankAccount sender = null;
    BankAccount receiver = null;

    // Search both accounts
    for (BankAccount account : accounts) {

        if (account.getAccountNumber() == senderAcc) {
            sender = account;
        }

        if (account.getAccountNumber() == receiverAcc) {
            receiver = account;
        }
    }

    if (sender == null) {
        System.out.println("Sender Account Not Found.");
        return;
    }

    if (receiver == null) {
        System.out.println("Receiver Account Not Found.");
        return;
    }

    System.out.print("Enter Amount : Rs. ");
    double amount = sc.nextDouble();

    if (amount <= 0) {
        System.out.println("Invalid Amount.");
        return;
    }

    if (amount > sender.getBalance()) {
        System.out.println("Insufficient Balance.");
        return;
    }

    // Debit Sender
    sender.setBalance(sender.getBalance() - amount);

    // Credit Receiver
    receiver.setBalance(receiver.getBalance() + amount);

    System.out.println("\nMoney Transferred Successfully!");
    System.out.println("Sender Balance   : Rs. " + sender.getBalance());
    System.out.println("Receiver Balance : Rs. " + receiver.getBalance());
}
    }
