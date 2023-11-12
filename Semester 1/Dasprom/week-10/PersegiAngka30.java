import java.util.Scanner;

public class PersegiAngka30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        while (true) {
            System.out.print("Masukkan angka : ");
            int N = sc.nextInt();
            
            if (N < 3) {
                System.out.println("Input Invalid!");
            } else {
                int spasi = N-2;
                for (int i = 1; i <= N; i++) {
                    if (i == 1 || i == N) {
                        for (int j = 1; j <= N; j++) {
                            System.out.print(N + " ");
                        }
                        System.out.println();
                    } else if (N > 9) {
                        System.out.print(N + " ");
                        for (int j = 1; j <= spasi; j++) {
                            System.out.print("   ");
                        }
                        System.out.print(N + "\n");
                    } else {
                        System.out.print(N + " ");
                        for (int j = 1; j <= spasi; j++) {
                            System.out.print("  ");
                        }
                        System.out.print(N + "\n");
                    }
                }
                break;
            }
        }
    }
}
