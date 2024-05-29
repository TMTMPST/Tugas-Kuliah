package Percobaan_1;

import java.util.Scanner;

public class GraphMain30 {
    public static void main(String[] args) throws Exception {
        Graph30 gedung = new Graph30(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1,3);
        gedung.printGraph();

        Scanner sc = new Scanner(System.in);

        System.out.print("Asal : ");
        int asal  = sc.nextInt();
        System.out.print("Tujuan : ");
        int tujuan = sc.nextInt();
        gedung.cekEdge(asal, tujuan);
    }
}
