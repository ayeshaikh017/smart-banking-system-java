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
    }
