import java.util.Scanner;

public class Main_30 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        AntrianDLL_30 antri = new AntrianDLL_30();
        LayananDLL_30 layanan = new LayananDLL_30();

        layanan.add(1, "Isi Angin", 2000);
        layanan.add(2, "Tambal Ban", 15000);
        layanan.add(3, "Cuci Sepeda", 5000);
        layanan.add(4, "Turun Mesin", 50000);
        layanan.add(5, "Cuci Mobil", 10000);

        int menu;
        do {
            System.out.println("==================================");
            System.out.println("       Bengkel Heinsenberg        ");
            System.out.println("==================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Tampilkan layanan");
            System.out.println("5. Total Pemasukan");
            System.out.println("6. keluar");
            System.out.println("==================================");

            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("No Hp : ");
                    String no = sc.nextLine();
                    antri.add(nama, no);
                    break;
                case 2:
                    antri.prosesLayanan();
                    layanan.print();
                    System.out.print("Pilih kode layanan :");
                    int kode = sc.nextInt();
                    int harga = layanan.search(kode);
                    if (harga >= 1) {
                    layanan.tambahkanHargaPemasukan(harga);
                    System.out.println("Total Pemasukan  : " + layanan.hitungTotalPemasukan());
                } else {
                    System.out.println("Kode layanan tidak valid.");
                }
                    break;
                case 3:
                    antri.print();
                    break;
                case 4:
                    layanan.sort();
                    layanan.print();
                    break;
                case 5:
                    System.out.println("Total Pemasukkan : " + layanan.hitungTotalPemasukan());
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("input salah");
                    break;
            }
        } while (menu != 6);
    }

}
