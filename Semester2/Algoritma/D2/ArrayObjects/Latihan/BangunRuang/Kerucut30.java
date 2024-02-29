public class Kerucut30 {

    public double jari;
    public double sisiMiring;

    public Kerucut30(double jari, double sisiMiring) {
        this.jari = jari;
        this.sisiMiring = sisiMiring;
    }

    public double LuasPermukaan() {
        return Math.PI * jari * (jari + sisiMiring);
    }

    public double Volume() {
        return (1.0 / 3.0) * Math.PI * jari * jari * sisiMiring;
    }

}