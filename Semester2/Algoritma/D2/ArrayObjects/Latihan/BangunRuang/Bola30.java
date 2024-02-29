public class Bola30 {
    public double jariJari;

    public Bola30(double jariJari) {
        this.jariJari = jariJari;
    }

    public double LuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double Volume() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}
