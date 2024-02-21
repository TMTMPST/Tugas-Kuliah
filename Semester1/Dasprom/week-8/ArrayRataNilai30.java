import java.util.Scanner;

public class ArrayRataNilai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];

        double totalLulus = 0 , totalTdkLulus = 0;
        double rata2Lulus, rata2TdkLulus;
        int counterlls = 0;
        int counterTdkLls = 0;
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke - " + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        } for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                counterlls++;
            } else if (nilaiMhs[i] <= 70) {
                totalTdkLulus += nilaiMhs[i];
                counterTdkLls++;
            }
        }
        System.out.println("Jumlah Mahasiswa yang lulus adalah : "  + counterlls);
        rata2Lulus = totalLulus/counterlls;
        System.out.println("Rata - rata nilai Lulus = " + rata2Lulus);
        System.out.println("Jumlah Mahasiswa yang lulus adalah : "  + counterTdkLls);
        rata2TdkLulus = totalTdkLulus/counterTdkLls;
        System.out.println("Rata - rata nilai Lulus = " + rata2TdkLulus);
    }
}
