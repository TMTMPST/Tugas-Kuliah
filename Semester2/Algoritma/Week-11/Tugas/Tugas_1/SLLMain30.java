package Tugas.Tugas_1;

import java.util.Scanner;

public class SLLMain30 {
    public static void main(String[] args) {
        SLL30 list = new SLL30();

        Mahasiswa30 mhs1 = new Mahasiswa30("Yusuf", 113);
        Mahasiswa30 mhs2 = new Mahasiswa30("Sari", 113);
        Mahasiswa30 mhs3 = new Mahasiswa30("Anton", 111);
        Mahasiswa30 mhs4 = new Mahasiswa30("Prita", 112);
        Mahasiswa30 mhs5 = new Mahasiswa30("Doni", 114);

        list.print();
        list.addFirst(mhs1);
        list.print();
        list.addLast(mhs2);
        list.print();
        list.addFirst(mhs3);
        list.print();
        list.insertAfter(mhs3, mhs4);
        list.print();
        list.insertAt(3, mhs5);
        list.print();
    }
}
