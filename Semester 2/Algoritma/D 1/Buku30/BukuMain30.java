package D1.Buku30;

public class BukuMain30 {
    public static void main(String[] args) {
        Buku30 buku1 = new Buku30();
        buku1.judul = "Today Ends Tomorrow Comes";
        buku1.pengarang = "Denanda Pratiwi";
        buku1.halaman = 198;
        buku1.stok = 13;
        buku1.harga = 71000;
        buku1.tampilInformasi();
        buku1.terjual(0);
        buku1.restock(0);
        buku1.gantiHarga(50000);

        Buku30 buku2 = new Buku30("Self Reward", "Mahera Ayesha", 160, 29, 59000);
    }
}

