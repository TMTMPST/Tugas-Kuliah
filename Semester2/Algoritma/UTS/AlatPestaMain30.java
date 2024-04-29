package UTS;

import java.util.Scanner;

public class AlatPestaMain30 {
    public static void main(String[] args) {
        Scanner sc30 = new Scanner(System.in);
    
        AlatPestaSystem30 data30 = new AlatPestaSystem30();
        System.out.print("Masukkan Jumlah alat pesta : ");
        int jumAlat30 = sc30.nextInt();
        sc30.nextLine();
        
        System.out.println("--------------------------------------------");
        System.out.println("Masukkan Alat Pesta");
        for (int i = 0; i < jumAlat30; i++) {
            System.out.println("===============================================");
            System.out.print("Nama              : ");
            String nama30 = sc30.nextLine();
            System.out.print("Kategori          : ");
            String kategori30 = sc30.nextLine();
            System.out.print("Harga / Hari      : ");
            int harga30 = sc30.nextInt();
            System.out.print("stok              : ");
            int stok30 = sc30.nextInt();
            sc30.nextLine();

            AlatPesta30 m = new AlatPesta30(nama30, kategori30, harga30, stok30);
            data30.tambah30(m);
        }
    while (true) {
        System.out.println("===============================================");
        System.out.println("Main Menu");
        System.out.println("1. Tampilkan Alat Pesta");
        System.out.println("2. Sorting Data");
        System.out.println("3. Cari Alat pesta (nama)");
        System.out.print("Pilih menu : ");
        int men30 = sc30.nextInt();

        switch (men30) {
            case 1:
                data30.tampil30();
                break;
            
            case 2:
                data30.bubbleSort30();
                data30.tampil30();
                break;

            case 3:
                sc30.nextLine();
                System.out.print("Nama Alat Pesta : ");
                String cari30 = sc30.nextLine();
                int posisi30 = data30.sort30(cari30);
                data30.tampilData30(cari30, posisi30);
                break;

            default:
                System.out.println("input Error");
                break;
        }
    }
    }
}
