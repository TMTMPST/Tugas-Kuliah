package Tugas.Tugas_2;

public class DLL30 {
    Film30 head;
    int size;

    public DLL30(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int id, String judul, float rating){
        if (isEmpty()) {
            head = new Film30(null, id, judul, rating, null);
        } else {
            Film30 node = new Film30(null, id, judul, rating, head);
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addLast(int id, String judul, float rating){
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            Film30 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Film30 node = new Film30(current, id, judul, rating, null);
            current.next = node;
            size++;
        }
    }

    public void addAtIndex(int id, String judul, float rating, int index) throws Exception {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else if (index < 0 || index > size) {
            throw new Exception("nilai index di luar batas");
        } else {
            Film30 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Film30 node = new Film30(null, id, judul, rating, null);
                current.prev = node;
                head = node;
            } else {
                Film30 node = new Film30(current.prev, id, judul, rating, current);
                node.prev = current.prev;
                node.next = current;
                current.prev.next = node;
                current.prev = node;
            }
        }
        size++;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Film masih kosong");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Film masih kosong");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Film30 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void removeAt(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("index diluar batas");
        } else if (index == 0) {
             removeFirst();
        } else {
            Film30 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            } if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void print(){
        if (!isEmpty()) {
            Film30 tmp = head;
            while (tmp != null) {
                System.out.println("Id Film     : " + tmp.id);
                System.out.println("Judul Film  : " + tmp.judul);
                System.out.println("Rating Film : " + tmp.rating);
                tmp = tmp.next;                
            }
        } else {
            System.out.println("Film kosong");
        }
    }

    public Film30 search(int id){
        if (isEmpty()) {
            System.out.println("Data masih kosong");
            return null;
        }
        Film30 current = head;
        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void printSearch(int id){
        Film30 Search = search(id);
        if (Search != null) {
            System.out.println("Film Ditemukan");
            System.out.println("Id Film     : " + Search.id);
            System.out.println("Judul Film  : " + Search.judul);
            System.out.println("Rating Film : " + Search.rating);
        } else {
            System.out.println("Id Film Tidak Ditemukan");
        }
    }

    public void sort(){
        if (isEmpty() || size == 1) {
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            Film30 current = head;
            for (int j = 0; j < size - i - 1; j++) {
                if (current.id > current.next.id) {
                    swap(current, current.next);
                }
                current = current.next;
            }
        }
    }

    private void swap(Film30 current, Film30 currentN){
        int tempId = current.id;
        String tempJud = current.judul;
        float tempRat = current.rating;

        current.id = currentN.id;
        current.judul = currentN.judul;
        current.rating = currentN.rating;

        currentN.id = tempId;
        currentN.judul = tempJud;
        currentN.rating = tempRat;
    }
}
