public class Kerucut30 {

    public double jariJari;
    public double sisiMiring;

    public Kerucut30(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double LuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    public double Volume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
    }

}