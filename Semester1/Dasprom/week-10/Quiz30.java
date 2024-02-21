import java.util.Random;
import java.util.Scanner;

public class Quiz30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char menu='y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();
                success = (answer == number);
                if (!success) {
                    
                } if (number < answer) {
                    System.out.println("Angka Kebesaran");
                } if (number > answer) {
                    System.out.println("Angka Kekecilan");
                }
            } while(!success);
            System.out.print("Apakah anda ingin mengulangi permainan (Y/y)");
            menu = sc.nextLine().charAt(0);
        } while (menu =='y' || menu == 'Y');
            
        
    }
}
