public class LimasSegiEmpatSamaSisi30 extends BangunRuang {

    int sisiAlas, tinggi;

    public LimasSegiEmpatSamaSisi30(int sisiAlas, int tinggi) {
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }

    public void printLuas() {
        System.out.println("Luas Limas Segi-4: " + ((sisiAlas * sisiAlas) + (4 * (0.5 * sisiAlas * tinggi))));
    }

    public void printVolume() {
        System.out.println("Volume Limas Segi-4: " + ((sisiAlas * sisiAlas) * tinggi / 3));
    }
}