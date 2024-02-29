
public class DataMahasiswa30 {

    public String nama;
    public String NIM;
    public String jenisKelamin;
    public double IPK;

    public void printData() {
        System.out.printf("Nama: %s\n", nama);
        System.out.printf("NIM: %s\n", NIM);
        System.out.printf("Jenis Kelamin: %s\n", jenisKelamin);
        System.out.printf("IPK: %.1f\n\n", IPK);
    }
    public static double menghitungRataRataIPK(DataMahasiswa30[] data) {
        double sum = 0;
        for (DataMahasiswa30 mahasiswa : data) {
            sum += mahasiswa.IPK;
        }
        return sum / data.length;
    }

    public static DataMahasiswa30 findHighestIPK(DataMahasiswa30[] data) {
        DataMahasiswa30 highest = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i].IPK > highest.IPK) {
                highest = data[i];
            }
        }
        return highest;
    }
}


    
