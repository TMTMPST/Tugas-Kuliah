public class LayananDLL_30 {
    Layanan_30 head;
    int size;
    int totalPemasukan;


    public LayananDLL_30(){
        head = null;
        size = 0;
        totalPemasukan = 0;

    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int kode, String nama, int harga){
        if (isEmpty()) {
            head = new Layanan_30(null, kode, nama, harga, null);
        } else {
            Layanan_30 node = new Layanan_30(null, kode, nama, harga, head);
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void add(int kode, String nama, int harga){
        if (isEmpty()) {
            addFirst(kode, nama, harga);
        } else {
            Layanan_30 current  = head;
            while (current.next != null) {
                current = current.next;
            }
            Layanan_30 node = new Layanan_30(current, kode, nama, harga, null);
            current.next = node;
            size++;
        }
    }

    public void sort(){
        if (isEmpty() || size == 1) {
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            Layanan_30 current = head;
            for (int j = 0; j < size - i - 1; j++) {
                if (current.harga > current.next.harga) {
                    swap(current, current.next);
                }
                current = current.next;
            }
        }
    }

    private void swap(Layanan_30 current, Layanan_30 currentN){
        int tempKode = current.kode;
        String tempNama = current.nama;
        int tempHar = current.harga;

        current.kode = currentN.kode;
        current.nama = currentN.nama;
        current.harga = currentN.harga;

        currentN.kode = tempKode;
        currentN.nama = tempNama;
        currentN.harga = tempHar;
    }

    public void print(){
        if (!isEmpty()) {
            Layanan_30 tmp = head;
            System.out.println("==================================");
            System.out.println("Layanan Berdasarkan Harga Termurah");
            System.out.println("==================================");
            while (tmp != null) {
                System.out.println("Kode            : " + tmp.kode);
                System.out.println("Nama Layanan    : " + tmp.nama);
                System.out.println("Harga           : " + tmp.harga);
                tmp = tmp.next;                
            }
            System.out.println("==================================");
        } else {
            System.out.println("Film kosong");
        }
    }

    public void tambahkanHargaPemasukan(int harga) {
        totalPemasukan += harga;
    }

    public int hitungTotalPemasukan() {
        return totalPemasukan;
    }

    public int search(int kode){
        if (isEmpty()) {
            System.out.println("Data masih kosong");
        }
        Layanan_30 current = head;
        while (current != null) {
            if (current.kode == kode) {
                return current.harga;
            }
            current = current.next;
        }
        return -1;
    }
    
}
