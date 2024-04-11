package Latihan;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelSevice list = new HotelSevice();
        Hotel h1 = new Hotel("Adrler", "Batu", 1000000, (byte) 4);
        Hotel h2 = new Hotel("Asetat", "Malang", 500000, (byte) 1);
        Hotel h3 = new Hotel("H20", "Surabaya", 750000, (byte) 2);
        Hotel h4 = new Hotel("HCl", "Ngaglik", 2000000, (byte) 5);
        Hotel h5 = new Hotel("WWW", "Sisir", 900000, (byte) 3);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Pilih Urutan Hotel Berdasarkan ");
        System.out.println("1. Harga");
        System.out.println("2. Bintang");
        System.out.print("Ketikkan Angka : ");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Daftar Hotel Berdasarkan Harga ");
            list.bubbleSort();
            list.tampilAll();
            
        } if (n == 2) {
            System.out.println();
            System.out.println("Daftar Hotel Berdasarkan Bintang ");
            list.selectionSort();
            list.tampilAll();
            
        } else {
            System.out.println("input Tidak Tersedia");
        }


        
        
    }
}
