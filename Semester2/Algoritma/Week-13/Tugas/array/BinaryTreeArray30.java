package Tugas.array;

public class BinaryTreeArray30 {
    int[] data;
    int idxLast;

    public BinaryTreeArray30(){
        data = new int[10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void tranverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            tranverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            tranverseInOrder(2 * idxStart + 2);
        }
    }

    public void add(int idx, int data){
        this.data[idx] = data;
    }
    
    // Traverse pre order
    public void traversePreOrder(int idxawal){
        if (idxawal <= idxLast) {
            if (data[idxawal] != 0) {
                System.out.print(data[idxawal] + " ");
            } else {
                System.out.print(idxLast + " ");
            }
            tranverseInOrder((2 * idxawal) + 1);
            tranverseInOrder((2 * idxawal) + 2);
        }  
    }
    
    // Traverse post order
    public void traversePostOrder(int idxawal){
        if (idxawal <= idxLast) {
            tranverseInOrder((2 * idxawal) + 1);
            tranverseInOrder((2 * idxawal) + 2);
            if (data[idxawal] == 0) {
                System.out.print(idxLast + " ");
            } else {
                System.out.print(data[idxawal] + " ");
            }
        }
    }
}
