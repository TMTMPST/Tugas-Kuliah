package Tugas;

import java.util.Scanner;

public class GraphMain30 {
    public static void main(String[] args) throws Exception {
        Graph30 gedung = new Graph30(6);
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("           Menu         ");
        System.out.println("=========================");
        System.out.println("1. Add Edge");
        System.out.println("2. Remove Edge");
        System.out.println("3. Degree");
        System.out.println("4. Print Graph");
        System.out.println("5. Cek Edge");
        System.out.println("0. Keluar");
        System.out.println("=========================");
        int menu;

        do {
        System.out.print("Pilih Menu : ");
        menu = sc.nextInt();
        sc.nextLine();
        
            switch (menu) {
                case 1:
                System.out.println("Penambahan Data");
                System.out.print("Asal : ");
                int asal = sc.nextInt();
                System.out.print("Tujuan : ");
                int tujuan = sc.nextInt();
                System.out.print("Jarak : ");
                int jarak = sc.nextInt();
                gedung.addEdge(asal, tujuan, jarak);
                break;
                case 2:
                System.out.println("Penghapusan Data");
                System.out.print("Asal : ");
                int asal1 = sc.nextInt();
                System.out.print("Tujuan : ");
                int tujuan1 = sc.nextInt();
                gedung.removeEdge(asal1, tujuan1);
                break;
                case 3:
                System.out.println("Degree");
                System.out.println("Asal : ");
                int asal2 = sc.nextInt();
                gedung.degree(asal2);
                break;
                case 4:
                System.out.println("Print Graph");
                gedung.printGraph();
                break;
                case 5:
                System.out.println("Cek Data");
                System.out.println("Asal   : ");
                int asal3 = sc.nextInt();
                System.out.println("Tujuan : ");
                int tujuan3 = sc.nextInt();
                gedung.cekEdge(asal3, tujuan3);
                break;
                
                default:
                break;
            }

        } while (menu != 0);
    }
}
