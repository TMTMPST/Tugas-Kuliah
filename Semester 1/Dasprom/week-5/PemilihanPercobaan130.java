import java.util.Scanner;

public class PemilihanPercobaan130 {

    public static void main(String[] args) {
        Scanner input30 = new Scanner(System.in);
        int angka = input30.nextInt();
        
        if (angka%2 == 0) {
            System.out.println("Angka " + angka + " bilangan genap");
        } else {
            System.out.println("Angka " + angka + " bilangan ganjil");
    }
    }
}
