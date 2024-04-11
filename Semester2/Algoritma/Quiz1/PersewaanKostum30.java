package Quiz1;

public class PersewaanKostum30 {
    String nama, merk;
    int stok, jumlah;

    public PersewaanKostum30(String nama, String merk, int stok, int jumlah){
        this.nama = nama;
        this.merk = merk;
        this.stok = stok;
        this.jumlah = jumlah;
    }

    public PersewaanKostum30(){

    }

    public void tampilInfo(){
        System.out.println("Nama                : " + nama);
        System.out.println("Merk                : " + merk);
        System.out.println("Stok                : " + stok);
        System.out.println("Jumlah yang disewa  : " + jumlah);
        
    }

    public int hitungSisa(){
        stok -= jumlah;
        System.out.println("Sisa stok " + nama + " adalah " + stok);
        return stok;

    }

    
}
