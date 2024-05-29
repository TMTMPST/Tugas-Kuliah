package Percobaan1;

public class BinaryTree30 {
    Node30 root;

    public BinaryTree30(){
        root = null;
    }
    
    boolean isEmpty(){
        return root!=null;
    }

    public void add(int data) {
        if(!isEmpty()) {
            root = new Node30(data);
        } else {
            Node30 current = root;
            while(true) {
                if(data < current.data) {
                    if(current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node30(data);
                        break;
                    }
                } else if(data > current.data) {
                    if(current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node30(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        Node30 current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node30 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node30 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(Node30 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    Node30 getSuccesor(Node30 del){
        Node30 successor = del.right;
        Node30 successorParrent = del;
        while (successor.left!=null) {
            successorParrent = successor;
            successor = successor.left;
        } if (successor != del.right) {
            successorParrent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    void delete(int data){
        if (!isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node30 parent = root;
        Node30 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data ");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current==root) {
                    root=current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node30 successor = getSuccesor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}
