package Quiz1;

import java.util.Scanner;

public class PersewaanMain30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jumlah barang");
        int brg = sc.nextInt();
        sc.nextLine();
        PersewaanKostum30[] prs = new PersewaanKostum30[brg];


        System.out.println("______________________________________");
        System.out.println("----------- MASUKKAN DATA ------------");
        System.out.println("______________________________________");

        for (int i = 0; i < prs.length; i++) {
            System.out.println("Barang ke- " + (i + 1));
            System.out.print("Nama                  : ");
            String nama = sc.nextLine();
            System.out.print("Merk                  : ");
            String merk = sc.nextLine();
            System.out.print("Stok                  : ");
            int stok = sc.nextInt();
            System.out.print("Jumlah yang disewa    : ");
            int jumlah = sc.nextInt();

            sc.nextLine();
            prs[i] = new PersewaanKostum30(nama, merk, stok, jumlah);
        }

        System.out.println("______________________________________");
        System.out.println("------------ REKAP DATA --------------");
        System.out.println("______________________________________");
        for (int i = 0; i < prs.length; i++) {
            System.out.println("Barang ke - " + (i +1));
            prs[i].tampilInfo();
            prs[i].hitungSisa();
            System.out.println();
        }
    }
}
