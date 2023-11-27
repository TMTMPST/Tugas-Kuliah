import java.util.Scanner;

public class percobaan330 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return(saldo);
        } else {
            return(1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Saldo Awal : ");
        int saldoAwal = sc.nextInt();
        System.out.print("Lamanya Investasi : ");
        int tahun = sc.nextInt();

        System.out.println("Jumlah saldo setelah " + tahun + " tahun");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}
