package Tugas;

import java.util.Scanner;

public class PembeliMain30 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan kapasitas queue: ");
    int jumlah = sc.nextInt();

    Queue30 antri = new Queue30(jumlah);
    int pilih;
    do  {
        menu();
        pilih = sc.nextInt();
        sc.nextLine();
        switch (pilih) {
            case 1:
                System.out.print("Nama : ");
                String nama = sc.nextLine();
                System.out.print("No HP : ");
                int noHP = sc.nextInt();
                Pembeli30 nb = new Pembeli30(nama, noHP);
                sc.nextLine();
                antri.enqueue(nb);
                break;
            
            case 2:
                Pembeli30 data = antri.dequeue();
                if (!"".equals(data.nama) && data.noHP != 0) {
                    System.out.println("Antrian Keluar: " + data.nama + " " +  data.noHP);
                    break;
                }
            
            case 3:
                antri.peek();
                break;
            
            case 4:
                antri.peekRear();
                break;

            case 5:
                antri.daftarPembeli();
                break;

            case 6:
                System.out.print("Nama yang dicari : ");
                String key = sc.nextLine();
                antri.peekPosition(key);
                break;
        }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
}

    public static void menu() {
        System.out.println("Pilih Menu : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Paling Belakang");
        System.out.println("5. Cek Semua Antrian");
        System.out.println("6. Cari Nama");
        System.out.println("----------------------------------");
    }
}
