public class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    void tampilkanInfo(){
        System.out.println("\nNomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + String.format("%.2f", saldo));

    }

    void setorUang(double jumlah){
        saldo+=jumlah;
        System.out.println( namaPemilik + " Menyetor Rp" + String.format("%.1f", jumlah)+ " Saldo sekarang : Rp" + String.format("%.1f", saldo));

    }

    void tarikUang(double jumlah){
        saldo-=jumlah;
        System.out.println( namaPemilik + " Menarik Rp" + String.format("%.1f", jumlah)+ " Saldo Sekarang: Rp" + String.format("%.1f", saldo));

    }
}
