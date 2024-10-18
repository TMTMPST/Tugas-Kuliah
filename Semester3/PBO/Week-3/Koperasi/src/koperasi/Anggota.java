/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koperasi;

/**
 *
 * @author vidoe
 */
public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }
    
    public void setor(float s){
        simpanan += s;
    }
    
    public void pinjam(float p){
        simpanan -= p;
    }
    
    private Anggota(String nm, String alt){
        nama = nm;
        alamat = alt;
    }
    
    public void cetakTransaksi(){
        System.out.println("Simpanan " + nama + " RP. " + simpanan);
    }
    
    public void kirim(Anggota a, float k){
        simpanan -= k;
        a.terima(k);
        System.out.println("Mengirim " + k + " ke " + a.getNama());
        cetakTransaksi();
    }
    
    public void terima(float t){
        simpanan += t;
        System.out.println("Menerima " + simpanan);
        cetakTransaksi();
    }
    
}
