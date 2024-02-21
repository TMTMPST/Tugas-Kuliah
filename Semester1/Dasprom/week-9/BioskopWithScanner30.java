import java.util.Scanner;

public class BioskopWithScanner30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        String[][] penonton = new String[4][2];
        Boolean benar = true;

        while (benar) {
            int menu;
            System.out.println("Pilih menu ");
            System.out.println("- Menu 1 : Input data Penonton");
            System.out.println("- Menu 2 : Tampilkan daftar penonton");
            System.out.println("- Menu 3 : Exit");
            System.out.print("Masukkan Menu : ");
            menu = sc.nextInt();

            sc.nextLine();

            if (menu == 1) {
                do {
                    
                    
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        
                        if ((baris - 1) >= penonton.length || (kolom - 1) >= penonton[baris - 1].length) {
                            System.out.println("Baris atau Kolom tidak tersedia\nMembuang Inputan");
                        } else if (penonton[baris - 1][kolom - 1] == null){
                            penonton[baris - 1][kolom - 1] = nama;
                        }
                        else {
                            System.out.println("Kursi telah diisi.\nMohon masukkan kembali baris dan kolom");
                            continue;
                        }
                        break;
                    }

                        System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    
                } while (next.equalsIgnoreCase("y"));

            } if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Penonton baris ke-" + (i+1) + ": ");
                    Boolean isNext = false;
                    for (String j : penonton[i]) {
                        if (isNext)
                        System.out.print(", ");
                        System.out.print((j == null) ? "***" : j);
                        isNext = true;
                        }
                        System.out.println();
                    }
                    continue;

            } if (menu == 3) {
                benar = false;

            } else {
                System.out.println("Input yang anda masukkan Invalid !!!!");
            }
        }
        
    }
}
