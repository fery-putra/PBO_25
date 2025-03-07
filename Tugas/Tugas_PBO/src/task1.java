import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        String admin_uname = "Admin013";
        String admin_pass = "password013";
        String name = "Fery Pratama";
        int nim = 8560013;
        Scanner menu = new Scanner(System.in);

        while (true) {
            System.out.println("Choose Menu:");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("Input Choice : ");
            int choice =menu.nextInt();
            if (choice == 1) {
                System.out.println("Username : ");
                String username = menu.next();
                System.out.println("Password : ");
                String password = menu.next();
                if (username.equals(admin_uname) && password.equals(admin_pass)) {
                    System.out.println("Admin Login Success");
                    break;
                } else {
                    System.out.println("Login Failed! Wrong Username or Password");
                }
            }
            else if (choice == 2) {
                System.out.println("Name: ");
                menu.nextLine();
                String username = menu.nextLine();
                System.out.println("NIM : ");
                int password = menu.nextInt();
                if (username.equals(name) && password==nim) {
                    System.out.println("Student Login Success");
                    System.out.println("Name: " + name);
                    System.out.println("NIM: " + nim);
                    break;
                } else {
                    System.out.println("Login Failed! Wrong Name or NIM ");
                }
            }
            else {
                System.out.println("Input invalid");
            }


        }
    }
}