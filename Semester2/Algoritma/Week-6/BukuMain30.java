import java.util.Scanner;

public class BukuMain30 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku30 data = new PencarianBuku30();
        int jumBuku = 3;

        System.out.println("------------------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari  kode buku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("----------------");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku \t : ");
            String juduBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int stock = s.nextInt();

            Buku30 m = new Buku30(kodeBuku, juduBuku, tahunTerbit, pengarang, tahunTerbit);
            data.tambah(m);
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Data yang Disorting");
        data.tampil();
        
        System.out.print("Judul Buku : ");
        String cari = s1.nextLine();
        PencarianBuku30.bubbleSort(data.listBk);
        System.out.println("Menggunakan Sequental Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("________________________________________");
        System.out.println("Menggunakan Binary Search");
        posisi = data.findBinarySearch(cari, jumBuku, posisi);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);



        // System.out.println("__________________________________________________________");
        // System.out.println("__________________________________________________________");
        // System.out.println("Pencarian Data : ");
        // System.out.println("Masukkan Kode Buku yang dicari");
        // System.out.print("Kode Buku : ");
        // String cari = s1.nextLine();
        // System.out.println("Menggunakan sequental search");
        // int posisi = data.findSeqSearch(cari);
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);

        // System.out.println("__________________________________________________________");
        // System.out.println("__________________________________________________________");
        // posisi = data.findBinarySearch(cari, 0, jumBuku - 1);
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);
    }
}