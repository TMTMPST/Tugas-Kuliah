/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan6;

/**
 *
 * @author vidoe
 */
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS = 100000;

    public Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }

    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
    
    public int getGaji(){
        return jumlahSKS * TARIF_SKS;
    }
}
