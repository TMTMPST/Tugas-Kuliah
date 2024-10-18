/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance1;

/**
 *
 * @author Rio
 */
public class Karyawan {
    public String nama,alamat, jk;
    public int umur,gaji;
    
    public Karyawan(){
        
    }
    public Karyawan(String nama, String alamat, String jk, int umur, int gaji){
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }
    
    public void tampilDataKaryawan(){
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Umur : " + umur);
        System.out.println("Gaji : " + gaji);
    }
}
    