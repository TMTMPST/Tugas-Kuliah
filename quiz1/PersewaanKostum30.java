package Quiz1;

public class PersewaanKostum30 {
    String nama;
    int stok, jumlah, harga;

    public PersewaanKostum30(String nama, int stok, int harga){
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public PersewaanKostum30(){

    }

    public void tampilInfo(){
        System.out.println("Nama                : " + nama);
        System.out.println("Stok                : " + stok);
        System.out.println("Jumlah yang disewa  : " + jumlah);
        
    }

    public int hitungSisa(){
        stok -= jumlah;
        System.out.println("Sisa stok " + nama + " adalah " + stok);
        return stok;

    }

    public int totalHarga(){
        jumlah
    }

    
}
