/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5;

/**
 *
 * @author vidoe
 */
public class Pertemuan5 {

    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        
        // Menambahkan Buku
        Buku buku1 = new Buku("Pemrograman Java", "Zeta", "B001");
        perpustakaan.tambahBuku(buku1);
        
        // Menambahkan Anggota
        Anggota anggota1 = new Anggota("Vidi", "A001");
        perpustakaan.tambahAnggota(anggota1);
        
        // Meminjam Buku
        perpustakaan.pinjamBuku("01-09-2024");
        
        // Mengembalikan Buku
        perpustakaan.kembalikanBuku("10-09-2024");
        
        // Tampilkan daftar buku
        perpustakaan.tampilkanBuku();
        
        //Mencoba Buku dan Anggota Lain
        Buku buku2 = new Buku("OwO BOOK", "Lytch", "B002");
        perpustakaan.tambahBuku(buku2);
        Anggota anggota2 = new Anggota("Chisato", "A002");
        perpustakaan.tambahAnggota(anggota2);
        perpustakaan.pinjamBuku("15-09-2024");
        perpustakaan.kembalikanBuku("20-09-2024");
        perpustakaan.tampilkanBuku();
        }
}
