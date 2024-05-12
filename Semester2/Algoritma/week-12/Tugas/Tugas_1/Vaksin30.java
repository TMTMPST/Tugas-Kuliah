package Tugas.Tugas_1;

public class Vaksin30 {
    String nama;
    int no;
    Vaksin30 next, prev;

    public Vaksin30( Vaksin30 prev, String nama, int no, Vaksin30 next){
        this.nama = nama;
        this.no = no;
        this. next = next;
        this.prev = prev;
    }
}
