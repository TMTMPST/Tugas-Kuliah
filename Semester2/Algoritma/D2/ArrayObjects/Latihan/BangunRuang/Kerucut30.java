

public class Kerucut30 extends BangunRuang {
    int jari, sisiMiring;

    public Kerucut30(int jari, int sisiMiring) {
        this.jari = jari;
        this.sisiMiring = sisiMiring;
    }

    public void printLuas() {
        System.out.println("Luas Kerucut: " + (Math.PI * jari * (jari + sisiMiring)));
    }

    public void printVolume() {
        double tinggi = Math.sqrt((sisiMiring * sisiMiring) - (jari * jari));
        System.out.println("Volume Kerucut: " + (Math.PI * jari * jari * tinggi / 3));
    }
}