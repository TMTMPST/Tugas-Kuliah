import java.util.Scanner;

public class DataMahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DataMahasiswa30[] dataMahasiswa = new DataMahasiswa30[3];
        for (int i = 0; i < 3; i++) {
            dataMahasiswa[i] = new DataMahasiswa30();
            System.out.printf("Masukan %d Data Mahasiswa\n", i+1);
            System.out.print("Masukkan Nama: ");
            dataMahasiswa[i].nama = sc.next();
            sc.nextLine();
            System.out.print("Masukkan NIM: ");
            dataMahasiswa[i].NIM = sc.next();
            sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            dataMahasiswa[i].jenisKelamin = sc.next();
            sc.nextLine();
            System.out.print("Masukkan IPK: ");
            dataMahasiswa[i].IPK = sc.nextDouble();
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d Data Mahasiswa\n", i+1);
            System.out.printf("Nama: %s\n", dataMahasiswa[i].nama);
            System.out.printf("NIM: %s\n", dataMahasiswa[i].NIM);
            System.out.printf("Jenis Kelamin: %s\n", dataMahasiswa[i].jenisKelamin);
            System.out.printf("IPK: %.1f\n", dataMahasiswa[i].IPK);
            System.out.println();
        }
        
        double averageIPK = DataMahasiswa30. menghitungRataRataIPK(dataMahasiswa);
        DataMahasiswa30 highestIPK = DataMahasiswa30.findHighestIPK(dataMahasiswa);

        System.out.println("\nRata-rata IPK: " + averageIPK);
        System.out.println("\nMahasiswa dengan IPK tertinggi:");
        highestIPK.printData();
        

    }
}
