public class BukuMain30 {
    public static void main(String[] args) {
        
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

        Buku30 bk2 = new Buku30("Self Reward", "Mahera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}
