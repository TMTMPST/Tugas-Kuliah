import java.util.Scanner;

public class tugas430 {
    static int MasbroRekursif(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return MasbroRekursif(x - 1) + MasbroRekursif(x - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Bulan : ");
        int N = sc.nextInt();

        System.out.print("Jumlah Pasangan MasBro adalah : ");
        System.out.println(MasbroRekursif(N));
    }
}
