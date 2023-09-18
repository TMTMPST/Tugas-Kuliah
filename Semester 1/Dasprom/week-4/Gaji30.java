import java.util.Scanner;

public class Gaji30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totGaji, gaji, potGaji;
        
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();

        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja ");
        jmlTdkMasuk=input.nextInt();

        System.out.println("Masukkan Gaji Kerja Anda ");
        gaji=input.nextInt();

        System.out.println("Masukkan Potongan Gaji Kerja Anda ");
        potGaji=input.nextInt();

        totGaji = (jmlMasuk*gaji) - (jmlMasuk*potGaji);
        System.out.println("Gaji yang akan anda terima adalah " + totGaji);
    }
}
