//Is class ka kaam sirf User related operations handle karna hai.
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {

    private ArrayList<User> users = new ArrayList<>();

    public void registerUser(Scanner sc) {

        System.out.println("\n===== User Registration =====");

        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        User newUser = new User(userId, name, email, password);

        users.add(newUser);

        System.out.println("\n User Registered Successfully!");
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
}