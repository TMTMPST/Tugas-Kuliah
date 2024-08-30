
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static TransaksiDLL dll = new TransaksiDLL();
    public static void main(String[] args) {
        addDummyData();
        int menu;
        do {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi Berdasarkan nama pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih 1 - 5 : ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    dll.tampilkanKendaraan();
                    break;
                case 2:
                    pembayaran();
                    break;
                case 3:
                    dll.TampilkanTransaksi();
                    break;
                case 4:
                    dll.sort();
                    break;
                case 5:
                    System.exit(0);
                    break;
                
            }
        } while (menu != 5);
        }

        static void addDummyData() {
            Kendaraan k1 = new Kendaraan("AB 4321 A", "Wisnu", "Motor", 150, 2020, 6);
            Kendaraan k2 = new Kendaraan("AB 1234 B", "Budi", "Mobil", 1800, 2019, 5);
            Kendaraan k3 = new Kendaraan("AB 5678 C", "Andi", "Motor", 300, 2021, 4);
            dll.tambahTransaksi(new TransaksiPajak(1, 450000, 200000, 6, k1));
            dll.tambahTransaksi(new TransaksiPajak(2, 750000, 0, 5, k2));
            dll.tambahTransaksi(new TransaksiPajak(3, 500000, 50000, 4, k3));
        }
    
        static void pembayaran() {
            System.out.print("Masukkan Nomor TNKB: ");
            String noTNKB = sc.nextLine();
            System.out.print("Masukkan Bulan Bayar: ");
            int bulanBayar = sc.nextInt();
            sc.nextLine();  // Consume newline
            dll.cariKendaraan(noTNKB, bulanBayar);
        }
    }

