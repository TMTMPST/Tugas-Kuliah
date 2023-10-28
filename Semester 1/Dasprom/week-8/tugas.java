import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Nilai : ");
        int jml = sc.nextInt();

        int[] nilai = new int[jml];
        System.out.println("Masukkan Nilai :");
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = sc.nextInt();
        }

        int maks = nilai[0];
        int min = nilai[0];
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > maks) {
                maks = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
            total += nilai[i];
        }

        double rata2 = total / jml;

        System.out.println("Nilai tertinggi: " + maks);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + rata2);
    }
}
