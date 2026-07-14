import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService(); 
      


       
        while (true) {
        System.out.println("\n===== SMART BANKING SYSTEM =====");
System.out.println("1. Register User");
System.out.println("2. Login User");
System.out.println("3. View Users");
System.out.println("4. View Accounts");
System.out.println("5. Deposit Money");
System.out.println("6. Withdraw Money");
System.out.println("7. Transfer Money");
System.out.println("8. Exit");
System.out.print("Enter Your Choice : ");
int choice = sc.nextInt();
    switch (choice) {

    case 1:
        userService.registerUser(sc);
        break;

    case 2:
        userService.loginUser(sc);
        break;

    case 3:
        userService.displayUsers();
        break;

   case 4:
    userService.displayAccounts();
    break;


    case 5:
    userService.depositMoney(sc);
    break;

    case 6:
    userService.withdrawMoney(sc);
    break;

    case 7:
    userService.transferMoney(sc);
    break;
    
    case 8:
    System.out.println("Thank You!");
    sc.close();
    return;

    default:
        System.out.println("Invalid Choice.");
}
        }
    }
}