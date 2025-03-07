import java.util.Scanner;

public class Admin {
    String admin_uname = "Admin013";
    String admin_pass = "password013";

    void login() {
        Scanner menu = new Scanner(System.in);
        System.out.println("Username : ");
        String username = menu.next();
        System.out.println("Password : ");
        String password = menu.next();
        if (username.equals(admin_uname) && password.equals(admin_pass)) {
            System.out.println("Admin Login Success");
        } else {
            System.out.println("Login Failed! Wrong Username or Password");
        }
    }
}
