import java.util.Scanner;

public class Mahasiswa {
    String name = "Fery Pratama";
    int nim = 8560013;

    void login() {
        Scanner menu = new Scanner(System.in);
        System.out.println("Name: ");
        String username = menu.nextLine();
        System.out.println("NIM : ");
        int password = menu.nextInt();
        if (username.equals(name) && password==nim) {
            System.out.println("Student Login Success");
        } else {
            System.out.println("Login Failed! Wrong Name or NIM ");
        }

    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);

    }
}
