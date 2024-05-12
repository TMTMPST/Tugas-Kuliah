package Tugas.Tugas_1;

public class DLL30 {
    Vaksin30 head;
    int size;

    public DLL30(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int no, String nama){
        if (isEmpty()) {
            head = new Vaksin30(null, nama, no, null);
        } else {
            Vaksin30 node = new Vaksin30(null, nama, no, head);
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void add(int no, String nama){
        if (isEmpty()) {
            addFirst(no, nama);
        } else {
            Vaksin30 current  = head;
            while (current.next != null) {
                current = current.next;
            }
            Vaksin30 node = new Vaksin30(current, nama, no, null);
            current.next = node;
            size++;
        }
    }

    public void remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tidak ada yang mengantri");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            Vaksin30 penerima = head.prev;
            System.out.println(penerima.nama + " telah divaksinasi");
            head.prev = null;
            size--;
            
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tidak ada yang mengantri");
        } else if (head.next == null) {
            Vaksin30 penerima = head;
            System.out.println(penerima.nama + " telah divaksinasi");
            head = null;
            size--;
            return;
        }
    }

    public void print(){
        if (!isEmpty()) {
            Vaksin30 tmp = head;
            System.out.println("|No.\t|Nama\t|");
            while (tmp != null) {
                System.out.println("|" + tmp.no  + "\t| " + tmp.nama + "\t|");
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian : "+ size);
        } else {
            System.out.println("Tidak ada yang mengantri");
        }
    }
}
