import java.util.Scanner;

public class tugas330 {
    static boolean primaRekursif(int x) {
        if (x <= 1) {
            return false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int N = sc.nextInt();

        System.out.print(primaRekursif(N) ? "Benar" : "Salah");
        
    }
}
