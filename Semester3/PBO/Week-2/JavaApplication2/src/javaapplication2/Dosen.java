/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author vidoe
 */
public class Dosen {
    String nidk;
    String nama;
    
    public void profile(String n, String nm){
        nidk = n;
        nama = nm;
        
    }
    
    public void cetak(){
        System.out.println("Nama = " + nama + "nidk  = " + nidk);

    }
    
    public float nilai(float n){
        return n;
    }
    
    public char nilaiHuruf(float n){
        if (n >= 80) {
            return 'A';
        } else if (n >= 60 && n <=79) {
            return 'B';
        } else {
            return 'E';
        }
    }
}