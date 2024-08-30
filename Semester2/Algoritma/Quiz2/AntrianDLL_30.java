public class AntrianDLL_30 {
    Pelanggan_30 head;
    int size;
    LayananDLL_30 layanan;

    public AntrianDLL_30(){
        head = null;
        size = 0;
        LayananDLL_30 layanan;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(String nama, String no){
        if (isEmpty()) {
            head = new Pelanggan_30(null, nama, no, null);
        } else {
            Pelanggan_30 node = new Pelanggan_30(null, nama, no, head);
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void add(String nama, String no){
        if (isEmpty()) {
            addFirst(nama, no);
        } else {
            Pelanggan_30 current  = head;
            while (current.next != null) {
                current = current.next;
            }
            Pelanggan_30 node = new Pelanggan_30(current, nama, no, null);
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
            Pelanggan_30 penerima = head.prev;
            System.out.println(penerima.nama + " ");
            head.prev = null;
            size--;
            
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tidak ada yang mengantri");
        } else if (head.next == null) {
            Pelanggan_30 penerima = head;
            System.out.println(penerima.nama + " ");
            head = null;
            size--;
            return;
        }
    }

    public void print(){
        if (!isEmpty()) {
            Pelanggan_30 tmp = head;
            while (tmp != null) {
                System.out.println("Nama    : " + tmp.nama);
                System.out.println("No HP   : "+ tmp.no);
                System.out.println("");
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian : "+ size);
        } else {
            System.out.println("Tidak ada yang mengantri");
        }
    }

    public void prosesLayanan() throws Exception{
            if (isEmpty()) {
                throw new Exception("Tidak ada yang mengantri");
            } else {
                Pelanggan_30 penerima = head;
                System.out.println("Layanan yang diterima : " + penerima.nama);
                remove();

        }
    }
}
