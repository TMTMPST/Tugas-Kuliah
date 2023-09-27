import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa jarak Musuh: ");
        int jarak = sc.nextInt();
        
        if (jarak <= 5) {
            System.out.println("Melee Weapon");
        } else if (jarak <=1000){
            System.out.println("Ranged Weapon");
        }
    }
}