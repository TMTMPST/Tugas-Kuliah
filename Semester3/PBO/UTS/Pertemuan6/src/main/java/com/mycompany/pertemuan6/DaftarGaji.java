/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan6;

/**
 *
 * @author vidoe
 */
public class DaftarGaji{
    private Pegawai[] listPegawai;

    
    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
    }
    
    public void addPegawai(Pegawai pegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {  // Find the first empty spot
                listPegawai[i] = pegawai;
                break;
            }
        }
    }
    
    public void printSemmuaGaji(){
        for (Pegawai pegawai : listPegawai) {
            if (pegawai != null) {  // Only print for non-null Pegawai
                System.out.println("Nama: " + pegawai.getNama() + ", Gaji: " + pegawai.getGaji());
            }
        }
    }
    
    
}
