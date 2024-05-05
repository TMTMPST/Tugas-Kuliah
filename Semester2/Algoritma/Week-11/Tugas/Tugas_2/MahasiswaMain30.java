package Tugas.Tugas_2;

import java.util.Scanner;

public class MahasiswaMain30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue mhs = new Queue();

        int menu;
        do {
            System.out.println("Pilihan Menu");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Exit");
            System.out.println("=================================== ");
            System.out.print("Pilih : ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("Name: ");
                    String nama = sc.nextLine();
                    System.out.print("Nim ");
                    int nim = sc.nextInt();
                    mhs.Enqueue(nama, nim);
                    break;
                case 2:
                    mhs.Dequeue();
                    break;
                case 3:
                    mhs.print();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Salah Input");
                    break;
            }
        } while (menu !=4);
        }
    }


