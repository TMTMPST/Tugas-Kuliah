public class TransaksiPajak {
    int kode, bulanBayar;
    long denda, nominalBayar;
    Kendaraan kendaraan;
    TransaksiPajak next, prev;


    public TransaksiPajak(int kode, int bulanBayar, long denda, long nominalBayar, Kendaraan kendaraan){
        this.kode = kode;
        this.bulanBayar = bulanBayar;
        this.denda = denda;
        this.nominalBayar = nominalBayar;
        this.kendaraan = kendaraan;
    }

    public TransaksiPajak(){

    }
}
