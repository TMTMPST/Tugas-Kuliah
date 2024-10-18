/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan5;

/**
 *
 * @author vidoe
 */
public class Perpustakaan {
    private Buku buku;
    private Anggota anggota;
    private Pinjaman pinjaman;

    public void tambahBuku(Buku buku) {
        this.buku = buku;
        System.out.println("Buku " + buku.getJudul() + " telah ditambahkan.");
    }

    public void tambahAnggota(Anggota anggota) {
        this.anggota = anggota;
        System.out.println("Anggota " + anggota.getNama() + " telah ditambahkan.");
    }

    public void pinjamBuku(String tanggalPinjam) {
        if (anggota == null || buku == null) {
            System.out.println("Anggota atau buku belum terdaftar.");
            return;
        }
        pinjaman = new Pinjaman(anggota, buku, tanggalPinjam);
        System.out.println(anggota.getNama() + " meminjam buku " +
                buku.getJudul() + " pada " + tanggalPinjam);
    }

    public void kembalikanBuku(String tanggalKembali) {
        if (pinjaman == null) {
            System.out.println("Tidak ada pinjaman yang aktif.");
            return;
        }
        pinjaman.setTanggalKembali(tanggalKembali);
        System.out.println(pinjaman.getAnggota().getNama() + " mengembalikan buku " + pinjaman.getBuku().getJudul()
                + " pada " + tanggalKembali);
    }

    public void tampilkanBuku() {
        if (buku == null) {
            System.out.println("Belum ada buku yang ditambahkan.");
        } else {
            System.out.println("Judul: " + buku.getJudul() + ", Penulis: " +
                    buku.getPenulis());
        }
    }
}
