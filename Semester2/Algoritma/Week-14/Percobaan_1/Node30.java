package Percobaan_1;

public class Node30 {

    int data;
    Node30 prev, next;
    int jarak;

    Node30(Node30 prev, int data, int jarak, Node30 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}