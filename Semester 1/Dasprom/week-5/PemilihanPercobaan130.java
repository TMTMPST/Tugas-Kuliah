import java.util.Scanner;

public class PemilihanPercobaan130 {

    public static void main(String[] args) {
        try (Scanner input30 = new Scanner(System.in)) {
            int angka = input30.nextInt();
            
            String hasil = (angka % 2 == 0) ? " Bilangan genap" : " Bilangan Ganjil";
            System.out.println("Angka " + angka + hasil);
        }
    }
}