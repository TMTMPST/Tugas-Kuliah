public class Bola30 extends BangunRuang {
    int jari;

    public Bola30(int jari) {
        this.jari = jari;
    }

    public void printLuas() {
        System.out.println("Luas Bola: " + (4 * Math.PI * jari * jari));
    }

    public void printVolume() {
        System.out.println("Volume Bola: " + ((4.0 / 3.0) * Math.PI * jari * jari * jari));
    }
}