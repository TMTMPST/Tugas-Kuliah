public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa30 m1 = new Mahasiswa30("Nusa", 2017, 25, 3);
        Mahasiswa30 m2 = new Mahasiswa30("Rara", 2012, 19, 4);
        Mahasiswa30 m3 = new Mahasiswa30("Dompu", 2018, 19, 3.5);
        Mahasiswa30 m4 = new Mahasiswa30("Abdul", 2017, 23, 2);
        Mahasiswa30 m5 = new Mahasiswa30("Ummi", 2019, 21, 3.75);

        list.tambah(m1);  
        list.tambah(m2); 
        list.tambah(m3);  
        list.tambah(m4); 
        list.tambah(m5);
        
        System.out.println("Data Mahasiswa Sebelum di Sorting");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah di Sorting desc berdasarkan IPK");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa Setelah di Sorting asc berdasarkan IPK");
        list.selectionSort();
        list.tampil();

        System.out.println("Data Mahasiswa Setelah di Sorting desc(Insertion) berdasarkan IPK");
        list.insertionSort();
        list.tampil();
    }
}
