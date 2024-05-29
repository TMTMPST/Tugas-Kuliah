package Tugas.Tugas_2;

public class Queue {
    Mahasiswa30 front;
    Mahasiswa30 rear;

    boolean isEmpty(){
        return front == null;
    }

    void print(){
        if (!isEmpty()) {
            Mahasiswa30 tmp = front;
            System.out.println("Isi Queue \t");
            while (tmp != null) {
                System.out.println("Nama : " + tmp.nama + ", NIM : " + tmp.nim);
                tmp = tmp.next;
            }
            System.out.println("");

        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void Enqueue(String nama, int nim){
        Mahasiswa30 node = new Mahasiswa30(nama, nim, null);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }

    public void Dequeue(){
        if (isEmpty()) {
            System.out.println("Data Masih Kosong");
        } else if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
    }
}