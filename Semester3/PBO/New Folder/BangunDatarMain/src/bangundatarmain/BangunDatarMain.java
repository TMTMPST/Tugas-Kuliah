/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangundatarmain;

/**
 *
 * @author vidoe
 */
public class BangunDatarMain {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 5;
        persegiPanjang.lebar = 3;
        float pL = persegiPanjang.luas();
        pL = persegiPanjang.panjang * persegiPanjang.lebar;
        System.out.println("Persegi Panjang - Luas: " + pL);
        float kP = persegiPanjang.keliling();
        kP = persegiPanjang.panjang + persegiPanjang.lebar;
        System.out.println("Keliling: " + kP);
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 4;
        float lL = lingkaran.luas();
        lL = (float) (Math.PI * lingkaran.r * lingkaran.r);
        float kL = lingkaran.keliling();
        kL = (float) (2 * Math.PI * lingkaran.r);
        System.out.println("Lingkaran - Luas: " + (lL));
        System.out.println("Keliling: " + (kL));
        
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 6;
        segitiga.tinggi = 4;
        System.out.println("Segitiga - Luas: " + (0.5 * segitiga.alas * segitiga.tinggi));
        System.out.println("Keliling: " + (3 * segitiga.alas));
    }
}
    

