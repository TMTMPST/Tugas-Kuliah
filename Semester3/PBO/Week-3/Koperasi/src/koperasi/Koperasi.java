/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koperasi;

/**
 *
 * @author vidoe
 */
public class Koperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Anggota anggota1 = new Anggota("Vidi", "Batu");
        Anggota anggota2 = new Anggota("Zeta", "Traeh");
        System.out.println("Simpanan " + anggota1.getNama() + " RP. " + anggota1.getSimpanan());
        anggota1.setNama("Vidi");
        anggota1.setAlamat("Batu");
        anggota1.setor(100000);
        
        System.out.println("Simpanan " + anggota1.getNama() + " RP. " + anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " RP. " + anggota1.getSimpanan());
        
        anggota1.cetakTransaksi();
        
        
        
        anggota1.kirim(anggota2 ,1000);
        anggota2.cetakTransaksi();
        
            
        
    }
    
}
