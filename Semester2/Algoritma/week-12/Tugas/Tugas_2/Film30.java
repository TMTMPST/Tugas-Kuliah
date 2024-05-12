package Tugas.Tugas_2;

public class Film30 {
    int id;
    float rating;
    String judul;
    Film30 prev, next;

    Film30(Film30 prev, int id, String judul, float rating, Film30 next){
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}
