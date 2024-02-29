public class LimasSegiEmpatSamaSisi30 {

    public double panjangSisiAlas;
    public double tinggiLimas;

    public LimasSegiEmpatSamaSisi30(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    public double LuasPermukaan() {
        double luasAlas = panjangSisiAlas * panjangSisiAlas;
        double luasSisiTegak = 4 * (0.5 * panjangSisiAlas * tinggiLimas);
        return luasAlas + luasSisiTegak;
    }

    public double Volume(double luasAlas) {
        return (1.0 / 3.0) * luasAlas * tinggiLimas;
    }

}