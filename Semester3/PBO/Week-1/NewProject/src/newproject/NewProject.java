/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newproject;

import java.util.Scanner;

/**
 *
 * @author vidoe
 */
public class NewProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilihan");
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi Panjang");
        do {
        System.out.print("Masukkan Pilihan : ");
        int pil = sc.nextInt();
            switch(pil){
                
            case 1:
                System.out.print("masukkan sisi : ");
                int sisi = sc.nextInt();
                System.out.println(bujurSangkar(sisi));
                break;
            
            case 2:
                System.out.print("masukkan Alas : ");
                double alas = sc.nextDouble();
                System.out.print("masukkan Tinggi : ");
                double tinggiS = sc.nextDouble();
                System.out.println(segitiga(alas, tinggiS));
                break;
                
            case 3:
                System.out.print("masukkan Panjang : ");
                int panjang = sc.nextInt();
                System.out.print("masukkan Tinggi : ");
                int tinggiP = sc.nextInt();
                System.out.println(persegiPanjang(panjang, tinggiP));
                break;
            
            default:
                 boolean i = true;
            }
        } while (true);
        
    }
    
    public static int bujurSangkar(int sisi){
        return sisi*sisi;
    }
    
    public static int persegiPanjang(int panjang, int tinggiP){
        return panjang * tinggiP;
    }
    
    public static double segitiga(double alas, double tinggiS){
        return 0.5*alas * tinggiS;
    }
}
