public class Buku30 {
    String judul, pengarang;
    int halaman, stok, harga;
    
    // public Buku30(){

    // }
    
    // public Buku30(String jdl, String pg, int hal, int stok, int har){
    //     judul = jdl;
    //     pengarang = pg;
    //     halaman = hal;
    //     this.stok = stok;
    //     harga = har;
    // }
    

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : Rp" + harga);
    }
    void terjual(int jml) {
        stok -= jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga (int hrg){
        harga = hrg;
    }
}
