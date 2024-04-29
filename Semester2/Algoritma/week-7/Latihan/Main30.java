package Latihan;

import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Kapasitas Gudang : ");
        int n = sc.nextInt();
        gudang30 gudang = new gudang30(n);
        while (true) {
            System.out.println("\nKapasitas MAX : " + gudang.size);
            System.out.println("Jumlah Barang : " + (gudang.top + 1) + "\n");
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang ");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan barang");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Lihat Barang Terbawah");
            System.out.println("6. Cari barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih operasi :");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = sc.nextLine();
                    barang30 barangBaru = new barang30(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
            
                case 2:
                    gudang.ambilBarang();
                    break;
                
                case 3:
                    gudang.tampilkanBarang();
                    break;
                
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Cari Barang (Kode / Nama) : ");
                    String i = sc.nextLine();
                    gudang.cariBarang(i);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihanm tidak valid. Silahkan coba lagi");
            }
        }
    }
}
