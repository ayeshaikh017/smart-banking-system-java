//Is class ka kaam sirf User related operations handle karna hai.
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    private static int nextUserId = 1;

private BankAccountService accountService =
        new BankAccountService();

    private ArrayList<User> users = new ArrayList<>();
    private boolean isEmailExists(String email) {

    for (User user : users) {
        if (user.getEmail().equalsIgnoreCase(email)) {
            return true;
        }
    }

    return false;
}

private boolean isValidEmail(String email) {

    return email.contains("@") && email.contains(".");
}

private boolean isValidPassword(String password) {

    return password.length() >= 6;
}

    public void registerUser(Scanner sc) {

    System.out.println("\n===== USER REGISTRATION =====");
    sc.nextLine();
int id = nextUserId++;

    System.out.print("Enter Name : ");
    String name = sc.nextLine();

    if (name.trim().isEmpty()) {
        System.out.println("Name cannot be empty.");
        return;
    }

    System.out.print("Enter Email : ");
    String email = sc.nextLine();

    if (!isValidEmail(email)) {
        System.out.println("Invalid Email Format.");
        return;
    }

    if (isEmailExists(email)) {
        System.out.println("Email already registered.");
        return;
    }

    System.out.print("Enter Password : ");
    String password = sc.nextLine();

    if (!isValidPassword(password)) {
        System.out.println("Password must contain at least 6 characters.");
        return;
    }

    

    User newUser = new User(id, name, email, password);

    users.add(newUser);
    BankAccount account =
        accountService.createAccount(id);

System.out.println("\nUser Registered Successfully!");

System.out.println("Generated User ID : "
        + newUser.getUserId());

System.out.println("Generated Account Number : "
        + account.getAccountNumber());

System.out.println("Opening Balance : Rs."
        + account.getBalance());

    System.out.println("\nUser Registered Successfully!");
}
    public void displayUsers() {

        if (users.isEmpty()) {
            System.out.println("\nNo users registered yet.");
            return;
        }

        System.out.println("\n===== Registered Users =====");

        for (User user : users) {
            user.displayUser();
            System.out.println("-------------------------");
        }
    }

    public void loginUser(Scanner sc) {

    System.out.println("\n===== USER LOGIN =====");

    sc.nextLine();

    System.out.print("Enter Email : ");
    String email = sc.nextLine();

    System.out.print("Enter Password : ");
    String password = sc.nextLine();

    for (User user : users) {

        if (user.getEmail().equalsIgnoreCase(email)
                && user.getPassword().equals(password)) {

            System.out.println("\nLogin Successful!");
            System.out.println("Welcome " + user.getName());

            return;
        }

    }

    System.out.println("\nInvalid Email or Password.");


}

public void displayAccounts() {

    accountService.displayAllAccounts();
}
public void depositMoney(Scanner sc) {

    System.out.println("\n===== DEPOSIT MONEY =====");

    System.out.print("Enter Account Number : ");
    int accountNumber = sc.nextInt();

    System.out.print("Enter Amount : ");
    double amount = sc.nextDouble();

    accountService.deposit(accountNumber, amount);

}
public void withdrawMoney(Scanner sc) {

    accountService.withdrawMoney(sc);
}
}