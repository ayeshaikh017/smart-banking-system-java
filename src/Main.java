import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService(); 
      


       
        while (true) {
            System.out.println("\n===== SMART BANKING SYSTEM =====");
            System.out.println("1. Register User");
            System.out.println("2. Login User");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View Balance");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    userService.registerUser(sc);
                    break;

                case 2:
                    userService.displayUsers();
                    break;

                case 3:
                    System.out.println("Thank you for using Smart Banking System.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}