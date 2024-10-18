/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author vidoe
 */
public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang() {
        System.out.println("Nama barang : "+namaBrg);
        System.out.println("Jenis barang : "+jenisBrg);
        System.out.println("Stok : "+stok);
    }
    public int tambahStok(int brgMasuk) {        
        int stokBaru=brgMasuk+stok;
        return stokBaru;
    }
}
