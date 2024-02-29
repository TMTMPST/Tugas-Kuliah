public class Bola30 {
    public double jari;

    public Bola30(double jari) {
        this.jari = jari;
    }

    public double LuasPermukaan() {
        return 4 * Math.PI * jari * jari;
    }

    public double Volume() {
        return (4.0 / 3.0) * Math.PI * jari * jari * jari;
    }
}
