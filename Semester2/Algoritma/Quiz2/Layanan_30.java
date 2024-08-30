public class Layanan_30 {
    int kode, harga;
    String nama;
    Layanan_30 prev, next;

    Layanan_30(Layanan_30 prev,int kode, String nama, int harga, Layanan_30 next){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.next = next;
    }
}
