import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.print("Masukkan Jumlah elemen yang dihitung : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang ingin henda dipangkatkan : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat : ");
            png[i].pangkat = sc.nextInt();
        }

        System.out.println("HASIL PANGKAT - BRUCE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println
            ("Hasil Dari : "
                + png[i].nilai + " pangkat " 
                + png[i].pangkat + " adalah "
                + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println
            ("Hasil Dari : "
                + png[i].nilai + " pangkat " 
                + png[i].pangkat + " adalah "
                + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
