/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author vidoe
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "JL. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "OwO";
        mhs2.alamat = "JL. Vinolia No 3A";
        mhs2.kelas = "1A";
        mhs2.tampilBiodata();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "UwU";
        mhs3.alamat = "JL. Vinolia No 2A";
        mhs3.kelas = "1A";
        mhs3.tampilBiodata();
        
    }
    
}
