import java.util.Scanner;

public class MainMultiDimensi30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultiDimensi30[][] ppArray = new MultiDimensi30[3][2];
        for (int i = 0; i < ppArray.length; i++) { 
            for (int j = 0; j < ppArray[i].length; j++) { 
                ppArray[i][j] = new MultiDimensi30();

                System.out.println("Persegi Panjang ke-" + (i + 1) + "," + (j + 1));
                System.out.print("Masukkan Panjang : ");
                ppArray[i][j].panjang = sc.nextInt();
                System.out.print("Masukkan Lebar : ");
                ppArray[i][j].lebar = sc.nextInt();
            }
        }

        
        for (int i = 0; i < ppArray.length; i++) {
            for (int j = 0; j < ppArray[i].length; j++) {
                System.out.println("Persegi Panjang ke-" + (i + 1) + "," + (j + 1));
                System.out.println("Panjang: " + ppArray[i][j].panjang + ", lebar : " + ppArray[i][j].lebar);
            }
        }
    }
}

