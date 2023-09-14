import java.util.Scanner;

public class Latihan30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r1, r2, r3, r4, I;
        float v;

        //Memasukkan Rangkaian Parrarel R1 - R3
        System.out.print("Masukkan R1 : ");
        r1 = input.nextDouble();
        System.out.print("Masukkan R2 : ");
        r2 = input.nextDouble();
        System.out.print("Masukkan R3 : ");
        r3 = input.nextDouble();

        //Hasil Rangkaian Parrarel R1 - R3
        double Rp = 1 / (1 / r1 + 1 / r2 + 1 / r3);
        System.out.println("Hasil Dari Rangkaian Pararel adalah " + Rp);

        //Memasukkan Rangkaian Seri R4
        System.out.print("Masukkan R4 : ");
        r4 = input.nextInt();

        //Rumus Dari Rangkaian Gabungan antara Rangkaian Pararel dan R4
        double Rg = Rp + r4;
        System.out.println("Hasil Dari Rangkaian Rangkaian Gabungan adalah " + Rg);

        //Memasukan Arus Listrik
        System.out.print("Masukkan I : ");
        I = input.nextInt();

        //Hasil Tegangan
        v = (float) (I * Rg);
        System.out.println("Tegangan V adalah : " + v + "volt"); 
    }
}
