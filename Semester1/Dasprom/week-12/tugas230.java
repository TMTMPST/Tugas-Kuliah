import java.util.Scanner;

public class tugas230 {
    static int penjumlahanRekursif (int x) {
        if (x == 0) {
            return(0);
        } else  {
            return (x + penjumlahanRekursif(x - 1));
        }   
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        int N = sc.nextInt();

        for (int i = 1; i < N; i++) {
            System.out.print(i + " + ");
        }
        System.out.print(N + " = ");
        System.out.println(penjumlahanRekursif(N));
    }
}
