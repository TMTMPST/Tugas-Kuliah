import java.util.Scanner;

public class BangunRuang30 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BangunRuang[] bangunRuang = new BangunRuang[3];

            for (int i = 0; i < bangunRuang.length; i++) {
                if (i == 0) {
                    System.out.println("Kerucut");
                    System.out.print("Masukkan Alas : ");
                    double alas = sc.nextDouble();
                    System.out.print("Masukkan Tinggi : ");
                    double tinggi = sc.nextDouble();
                    bangunRuang[i] = new LimasSegiEmpatSamaSisi30(alas, tinggi);
                } if (i == 1) {
                    System.out.println("Kerucut");
                    System.out.print("Masukkan Jari Jari");
                    double jari = sc.nextDouble();
                    System.out.print("Masukkan Sisi Miring");
                    double sisiMiring = sc.nextDouble();
                    bangunRuang[i] = new kerucut30(jari, sisiMiring);
                    
                } if (i == 2) {

                    System.out.println("Kerucut");
                    System.out.print("Masukkan Jari Jari");
                    double jari = sc.nextDouble();
                    bangunRuang[i] = new Bola30(jari);
                }
                bangunRuang[i].printLuas();
                bangunRuang[i].printVolume();
            }
            }
            
    }
