import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {

        String admin_uname = "Admin013";
        String admin_pass = "password013";
        String nama = "Fery Pratama";
        int nim = 8560013;
        Scanner menu = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih Login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("Masukkan pilihan : ");
            int pilihan=menu.nextInt();
            if (pilihan== 1) {
                System.out.println("Masukkan username : ");
                String username = menu.next();
                System.out.println("Masukkan password : ");
                String password = menu.next();
                if (username.equals(admin_uname) && password.equals(admin_pass)) {
                    System.out.println("Login Admin Berhasil");
                    break;
                } else {
                    System.out.println("Login Gagal! Username atau Password salah");
                }
            }
            else if (pilihan == 2) {
                System.out.println("Masukkan Nama: ");
                menu.nextLine();
                String username = menu.nextLine();
                System.out.println("Masukkan NIM : ");
                int password = menu.nextInt();
                if (username.equals(nama) && password==nim) {
                    System.out.println("Login Mahasiswa Berhasil");
                    System.out.println("Nama: " + nama);
                    System.out.println("NIM: " + nim);
                    break;
                } else {
                    System.out.println("Login Gagal! Nama atau NIM salah");
                }
            }
            else {
                System.out.println("Pilihan tidak valid");
            }


        }
    }
}