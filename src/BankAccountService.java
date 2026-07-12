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
}