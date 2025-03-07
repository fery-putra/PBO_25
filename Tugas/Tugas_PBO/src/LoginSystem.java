import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Student student = new Student();
        Admin admin = new Admin();
        Scanner menu = new Scanner(System.in);

        while (true) {
            System.out.println("Choose Menu:");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("Input Choice : ");
            int choice =menu.nextInt();

            switch (choice) {
                case 1:
                    admin.login();
                    break;

                case 2:
                    student.login();
                    student.displayInfo();
                    break;

                default:
                    System.out.println("Invalid Choice");
                    System.exit(0);

            }


        }
    }
}