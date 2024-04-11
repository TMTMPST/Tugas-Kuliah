package Quiz1;

import java.util.Scanner;

public class PersewaanMain30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("                  List Kostum                  ");
        System.out.println("===============================================");
        System.out.println("| QWERTY            | Rp. 100.000              ");
        System.out.println("| ADLER             | Rp. 150.000              ");
        System.out.println("| XENO              | Rp. 200.000              ");
        System.out.println("| ZETA              | Rp. 120.000              ");
        System.out.println("| LAW               | Rp. 140.000              ");
        
        

        PersewaanKostum30[] prs = new PersewaanKostum30[4];
        prs[0] = new PersewaanKostum30("QWERTY", 20, 100000);
        prs[1] = new PersewaanKostum30("ADLER", 10, 150000);
        prs[2] = new PersewaanKostum30("XENO", 10, 200000);
        prs[3] = new PersewaanKostum30("ZETA", 5, 120000);
        prs[4] = new PersewaanKostum30("LAW", 6, 140000);

        System.out.println("Berapa banyak kostum yang ingin anda sewa : " );
        int brg = sc.nextInt();

        for (int i = 1; i <= brg; i++) {
            System.out.println("Kostum mana yang ingin anda pinjam : " );
            int n = sc.nextInt();
            prs[n - 1].hitungSisa();
        }

        int totalHargaSewa = 0;
        for (PersewaanKostum30 kostum : prs) {
        totalHargaSewa += kostum.totalHarga;
        }
        System.out.println("Total harga sewa keseluruhan adalah Rp. " + totalHargaSewa);
    }
}
