import java.util.Scanner;

public class percobaan630 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan Panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan lebar : ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah " + L);

        vol = hitungVolume(t,p,l);
        System.out.println("Volume balok adalah " + vol);
        input.close();
    }
    static int hitungLuas (int pjg, int lb){
        int Luas = pjg* lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a , int b) {
        int volume = hitungLuas(a, b) *tinggi;
        return volume;
    }
}
