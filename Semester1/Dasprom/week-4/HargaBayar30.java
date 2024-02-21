import java.util.Scanner;

public class HargaBayar30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah;
        double total, bayar, jmlDis;

        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah  barang yang dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan Diskon barang yang dibeli ");
        jmlDis = input.nextDouble();

        total = harga * jumlah;
        bayar = total - jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah : " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah : " + bayar);
    }
}
