public class BukuMain30 {
    public static void main(String[] args) {
        
        System.out.println("======================================================");
        Buku30 bk1 = new Buku30();
        bk1.judul = "Today Ends Tommorow Comes";
        bk1.pengarang = "Denanda pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        bk1.hitungHargaTotal(5);
        bk1.hitungDiskon();
        bk1.hitungHargaBayar();
  
        System.out.println("======================================================");

        Buku30 bk2 = new Buku30("Self Reward", "Mahera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        bk2.hitungHargaTotal(3);
        bk2.hitungHargaBayar();
        bk2.hitungDiskon();

        System.out.println("======================================================");
        Buku30 bkVidi = new Buku30("I Killed The Demon King", "Laswae", 120 , 30, 100000);
        bkVidi.terjual(20);
        bkVidi.tampilInformasi();
        bkVidi.hitungHargaTotal(4);
        bkVidi.hitungHargaBayar();
        bkVidi.hitungDiskon();
        System.out.println("======================================================");
    }
}
