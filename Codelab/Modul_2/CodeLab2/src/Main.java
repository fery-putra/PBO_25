public class Main {
    public static void main(String[] args) {

        RekeningBank rekening1=new RekeningBank();
        RekeningBank rekening2=new RekeningBank();

        rekening1.nomorRekening="08560013";
        rekening1.namaPemilik="Fery";
        rekening1.saldo=20000000;

        rekening2.nomorRekening="08560426";
        rekening2.namaPemilik="Fera";
        rekening2.saldo=20000000;

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();


        rekening1.setorUang(200000);
        rekening2.setorUang(200000);

        rekening1.tarikUang(100000);
        rekening2.tarikUang(100000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}