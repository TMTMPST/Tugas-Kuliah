import java.util.Scanner;

public class SegitigaBintang30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int k = i; k <= N ; k++) {
                System.out.print("*");
            }   System.out.println("");
            }
    }
}
