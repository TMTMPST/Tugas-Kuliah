package Tugas.Tugas_1;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

public class SLL30 {
    Node30 head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node30 tmp = head;
            System.out.print("Isi Linked List \t");
            while (tmp != null) {
                Mahasiswa30 mhs = (Mahasiswa30) tmp.data;
                System.out.println("Nama : " + mhs.nama + ", NIM : " + mhs.nim);
                tmp = tmp.next;
            }
            System.out.println("");

        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(Mahasiswa30 input){
        Node30 ndInput = new Node30(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa30 input) {
        Node30 ndInput = new Node30(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(Mahasiswa30 key, Mahasiswa30 input){
        Node30 ndInput = new Node30(input, null);
        Node30 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, Mahasiswa30 input){
        if (index < 0) {
            System.out.println("Perbaiki logikanya!" + "Kalau indexnya -1 bagaimana??");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node30 temp = head;
            for (int i = 0; i < index - 1 ; i++) {
                temp = temp.next;
            }
            temp.next = new Node30(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    
}


