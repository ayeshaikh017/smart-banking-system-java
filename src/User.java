public class User{
int userId;
String name;
String email;
String password;

User(int userId, String name, String email, String password){
    this.userId = userId;
    this.name = name;
    this.email = email;
    this.password = password;

}

void displayUser(){
 System.out.println("User ID: " + userId);
    System.out.println("Name: " + name);
    System.out.println("Email: " + email);


}

}