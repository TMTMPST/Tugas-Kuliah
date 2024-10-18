/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6;

/**
 *
 * @author vidoe
 */
public class Pertemuan6 {

    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("24517210123", "Dr. Vestia Zeta", "Jakarta");
        dosen1.setJumlahSKS(14);  

        Dosen dosen2 = new Dosen("24517210123", "Dr. Nishigi Chisato", "Malang");
        dosen2.setJumlahSKS(12);  

        DaftarGaji daftarGaji = new DaftarGaji(2); 
        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        daftarGaji.printSemuaGaji();

    }
        
 }

