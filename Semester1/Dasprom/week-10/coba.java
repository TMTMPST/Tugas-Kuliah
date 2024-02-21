import java.util.Scanner; 

public class coba { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int bookStore[][] = new int[3][3];
        for (int i = 0; i < bookStore.length; i++) {
            System.out.println("Toko ke " + i);
            for (int j = 0; j < bookStore[i].length; j++) {
                System.out.print("Data ke - " + (j + 1) + ": ");
                bookStore[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
} 