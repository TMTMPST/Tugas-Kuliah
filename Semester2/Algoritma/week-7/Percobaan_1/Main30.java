package Percobaan_1;

import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        gudang30 gudang = new gudang30(7);
        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang ");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi :");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan kode barang : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Masukkan nama barang : ");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    System.out.println("Masukkan nama kategori : ");
                    String kategori = sc.nextLine();
                    barang30 barangBaru = new barang30(kode, nama, kategori);
                    break;
            
                case 2:
                    gudang.ambilBarang();
                    break;
                
                case 3:
                    gudang.tampilkanBarang();
                    break;
                
                case 4:
                    break;
                
                default:
                    System.out.println("Pilihanm tidak valid. Silahkan coba lagi");
            }
        }
    }
}
