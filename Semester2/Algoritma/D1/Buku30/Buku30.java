public class Buku30 {
    String judul, pengarang;
    int halaman, stok, harga;
    float diskon, hargaTotal, bayar;
    
    public Buku30(){

    }

    public Buku30(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    
    void tampilInformasi(){
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Sisa Stok : " + stok);
        System.out.println("Harga : Rp. " + harga);
    }

    void terjual (int jml) {
        if (stok > 0) {
            stok -= jml;
            
        } if (stok <= 0) {
            System.out.println("Stok Kosong");
        }
    }

    void  restock (int jml) {
        stok += jml;
    }

    void gantiHarga (int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jml) {
        hargaTotal = harga * jml;
        return(int) hargaTotal;
    }
    
    int hitungDiskon() {
        if (hargaTotal > 150000) {
            diskon = hargaTotal * 0.12f;
            System.out.println("Diskon : Rp. " + diskon);
        } else if (hargaTotal >= 75000) {
            diskon = hargaTotal * 0.05f;
            System.out.println("Diskon : Rp. " + diskon);
        } else {
            diskon = 0;
            System.out.println("Diskon : Rp. " + diskon);
        }
        return(int) diskon;
    }

    int hitungHargaBayar() {
        bayar = hargaTotal - diskon;
        System.out.println("Harga Bayar : Rp. " + bayar);
        return(int) bayar;
    }
}