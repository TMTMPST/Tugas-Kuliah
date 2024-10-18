/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author vidoe
 */
public class Peminjaman {
    String id, namaMember, namaGame;
    long harga;
    int bulan;
    
    public static long bayarPeminjaman(long harga, int bulan){
        return harga * bulan;
    }
    
    public static void main(String[] args) {
        System.out.println(bayarPeminjaman(10000, 12));
    }
}
