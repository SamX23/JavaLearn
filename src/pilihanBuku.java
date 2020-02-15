import java.util.Scanner;

public class pilihanBuku {
    private Scanner masuk = new Scanner(System.in);
    private int buku = masuk.nextInt();
    private int harga = 0;

    void cetakDisplay() {
        System.out.println("Silahkan pilih buku");
        System.out.println("1. Novel");
        System.out.println("2. Biografi");
        System.out.println("3. Komik");
        pilihBuku();
        System.out.println("Harga: " + harga);
        System.out.println("");
        System.out.println("masukan uang :");
        duit();
    }

    private void duit() {
        int uang = masuk.nextInt();
        if (uang > harga) {
            int kembalian = uang - harga;
            System.out.println("kembali :" + kembalian);
        } else if (uang < harga) {
            System.out.println("Uang kurang");
        } else {
            System.out.println("Sipp uang pas");
        }
    }

    private void pilihBuku() {
        switch (buku) {
            case 1:
                System.out.println("novel");
                harga = 100000;
                break;
            case 2:
                System.out.println("komik");
                harga = 50000;
                break;
            case 3:
                System.out.println("biografi");
                harga = 20000;
                break;
            default:
                System.out.println("Tidak ada category");
                break;
        }
    }
}
