import java.util.Scanner;

public class Pemilihan2Percobaan230 {
    public static void main(String[] args) {
        Scanner input30 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalsudut;

        System.out.print("Masukkan Sudut 1 : ");
        sudut1 = input30.nextInt();
        System.out.print("Masukkan Sudut 2 : ");
        sudut2 = input30.nextInt();
        System.out.print("Masukkan Sudut 3 : ");
        sudut3 = input30.nextInt();
        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180) {
            if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)) {
                    System.out.println("Segitiga tersebut adalah segitiga siku siku sama kaki");
                } else {
                    System.out.println("Segitiga tersebut adalah segitiga siku siku");
                }
            } else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)){
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)){
                System.out.print("segitiga tersebut adalah segitiga sama sisi");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }

        } else {
            System.out.println("Bukan Segitiga");
        }input30.close();
    }
}
