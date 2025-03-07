import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Mahasiswa mahasiswa = new Mahasiswa();
        Admin admin = new Admin();
        Scanner menu = new Scanner(System.in);

        while (true) {
            System.out.println("Choose Menu:");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("Input Choice : ");
            int choice =menu.nextInt();
            if (choice == 1) {
              admin.login();

            }
            else if (choice == 2) {
              mahasiswa.login();
              mahasiswa.displayInfo();

            }
            else {
                System.out.println("Input invalid");
                break;
            }


        }
    }
}