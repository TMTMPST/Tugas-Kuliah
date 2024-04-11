import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("_________________");
        System.out.print("Masukkan Jumlah elemen : ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[iJml];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke - " + (i + 1 ) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("Hasil - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan Faktorial mengunakan brute force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("Hasil - DIVIDE CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan Faktorial mengunakan Divide Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}