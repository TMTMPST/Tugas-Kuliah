package Balok30;

public class Balok30 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok30(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;

    }

    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }

}