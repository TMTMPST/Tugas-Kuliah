import java.util.Scanner;

public class Bank30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlTabunganAwal, lamaMenabung;
        double presentasiBunga = 0.02, bunga, jmlTabunganAkhir;

        System.out.println("masukkan jumlah tabungan awal anda");
        jmlTabunganAwal = input.nextInt();
        System.out.println("masukkan lama menabung anda");
        lamaMenabung = input.nextInt();
        bunga = lamaMenabung * presentasiBunga * jmlTabunganAwal;
        jmlTabunganAkhir = bunga + jmlTabunganAwal;
        System.out.println("jumlah tabungan akhir anda adalah " + jmlTabunganAkhir);
    }
}
