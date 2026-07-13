import java.util.ArrayList;

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
    }
