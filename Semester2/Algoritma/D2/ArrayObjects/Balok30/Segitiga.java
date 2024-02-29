package Balok30;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int T) {
        alas = a;
        tinggi = T;

    }

    public int hitungLuas() {
        return alas * tinggi * 1/2;
    }

    public double hitungKeliling(){
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}
