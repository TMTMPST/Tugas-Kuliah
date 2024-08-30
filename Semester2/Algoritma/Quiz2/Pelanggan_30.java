public class Pelanggan_30 {
    String nama;
    String no;
    Pelanggan_30 next, prev;

    public Pelanggan_30(Pelanggan_30 prev,String nama, String no, Pelanggan_30 next){
        this.nama = nama;
        this.no = no;
        this.prev = prev;
        this.next = next;
    }
}