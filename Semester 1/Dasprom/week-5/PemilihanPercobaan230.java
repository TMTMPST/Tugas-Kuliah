import java.util.Scanner;

public class PemilihanPercobaan230 {
    public static void main(String[] args) {
        Scanner input30 = new Scanner(System.in);
        System.out.print("Nilai UAS : ");
        float uas = input30.nextFloat();
        System.out.print("Nilai UTS : ");
        float uts = input30.nextFloat();
        System.out.print("Nilai Kuis : ");
        float kuis = input30.nextFloat();
        System.out.print("Nilai Tugas  : ");
        float tugas = input30.nextFloat();

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);
        if (80 <= total && total <= 100) {
            System.out.println(total +" Mendapatkan Nilai A (Sangat Baik)");
        } else if (73 <= total && total < 80){
            System.out.println("Mendapatkan Nilai  B+ (Lebih dari Baik)");
        } else if (65 <= total && total < 73){
            System.out.println("Mendapatkan Nilai B (Baik)");
        } else if (60 <= total && total < 65) {
            System.out.println("Mendapatkan Nilai C+ (Lebih dari Cukup)");
        } else if (50 <= total && total < 60) {
            System.out.println("Mendapatkan Nilai C (Cukup)");
        } else if (39 <= total && total < 50) {
            System.out.println("Mendapatkan Nilai D (Kurang)");
        } else if (total < 39) {
            System.out.println("Mendapatkan Nilai E (Gagal)");
        }
    }           
}
