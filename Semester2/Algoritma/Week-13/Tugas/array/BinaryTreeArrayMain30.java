package Tugas.array;

public class BinaryTreeArrayMain30 {
    public static void main(String[] args) {
        
        BinaryTreeArray30 bta = new BinaryTreeArray30();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.tranverseInOrder(0);
        System.out.println("\n");
        System.out.println("Tranverse Post & Pre (Order)");
        bta.add(2, 1);
        System.out.print("PostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.print("\nPreOrder Traversal : ");
        bta.traversePreOrder(0);
    }
}
