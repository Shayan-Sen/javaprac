package binarytree;

class Node {
    private int data;
    private Node left;
    private Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    void setLeft(Node left) {this.left = left;}

    void setRight(Node right) {this.right = right;}

    Node getLeft() {return this.left;}

    Node getRight() {return this.right;}

    int getData() {return this.data;}
}
