package Percobaan_2;

public class Queue30 {
    Nasabah30[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue30 (int n){
        max = n;
        data = new Nasabah30[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek(){
        if (!isEmpty()) {
            System.out.println("Elemen Terdepan :   " + data[front].norek + " " + data[front].nama 
            + " " + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " 
                                    + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " 
                                + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen : " + size);
        }
    }

    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }

    public void Enqueue(Nasabah30 dt){
        if (isFull()) {
            System.out.println("Data sudah penuh");
            System.out.println("Menghentikan Program dikarenakan Overflow");
            System.exit(0);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah30 Dequeue(){
        Nasabah30 dt = new Nasabah30();
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong");
            System.out.println("Menghentikan Program dikarenakan Underflow");
            System.exit(0);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekRear(){
        if (!isEmpty()) {
            System.out.println("Elemen Terdepan :   " + data[rear].norek + " " + data[rear].nama 
            + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}