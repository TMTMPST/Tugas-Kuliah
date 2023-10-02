import java.util.Scanner;

public class Pemilihan2Percobaan130 {
    public static void main(String[] args) {
        Scanner input30 = new Scanner(System.in);

        System.out.print("Masukkan Tahun : ");
        int thn = input30.nextInt();
        
        if ((thn % 4) == 0) {
            if ((thn % 100)!=0) {
                System.out.println(thn + " Tahun Kabisat");
            } else if ((thn % 400)==0){
                System.out.println(thn + " Tahun Kabisat");
            }
            else {
                System.out.println("Bukan Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
