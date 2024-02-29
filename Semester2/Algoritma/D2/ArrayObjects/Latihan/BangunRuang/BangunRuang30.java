import java.util.Scanner;

public class BangunRuang30 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BangunRuang30[] bangunRuang = new BangunRuang30[3];
            for (int i = 0; i < bangunRuang.length; i++) {
                System.out.println("========== Bangun Ruang ==========");
                System.out.println("1. Kerucut");
                System.out.println("2. Limas Segi Empat");
                System.out.println("3. Bola");
                System.out.println("Pilih Jenis Bangun Ruang : ");
                int pil = sc.nextInt();

                switch (pil) {
                    case 1:
                    System.out.println("Masukkan Jari Jari : ");
                    double jariJariKerucut = sc.nextDouble();
                    System.out.println("Masukkan Sisi Miring : ");
                    double sisiMiringKerucut = sc.nextDouble();
                    bangunRuang[i] = new Kerucut30(jariJariKerucut, sisiMiringKerucut);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                
                    default:
                        break;
                }
            }

    }
}
    
 

