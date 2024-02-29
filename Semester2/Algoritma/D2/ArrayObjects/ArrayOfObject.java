import java.util.Scanner;

public class ArrayOfObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Masukkan Berapa Persegi Panjang : ");
        n = sc.nextInt();
        
        PersegiPanjang30[] ppArray = new PersegiPanjang30[n];

        Persegi[] pgArray = new Persegi[100];
        for (int i = 0; i < pgArray.length; i++) {
            pgArray[i] = new Persegi();
        }

        pgArray[5].sisi = 20;


        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang30();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan Panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
        }


    }
}
