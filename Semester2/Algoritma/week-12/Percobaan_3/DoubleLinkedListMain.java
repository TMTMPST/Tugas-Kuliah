package Percobaan_3;

public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();

        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================================");
        System.out.println("Data Awal Linked List adalah " + dll.getFirst());
        System.out.println("Data Akhir Linked List adalah " + dll.getLast());
        System.out.println("Data index ke 1 Linked List adalah " + dll.get(1));
    }
}