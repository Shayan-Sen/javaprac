package binarytree;

/**
 * This class represents a node in a binary tree.
 * Each node contains an integer data value and references to its left and right child nodes.
 * The class provides methods to set and get the left and right children, as well as to retrieve the data value.
 * 
 * Example usage:
 * Node node = new Node(10); // Creates a new node with data value 10
 * node.setLeft(new Node(5)); // Sets the left child of the node
 * node.setRight(new Node(15)); // Sets the right child of the node
 * int value = node.getData(); // Retrieves the data value of the node
 * 
 * Note: This implementation assumes that the user will manage the tree structure externally.
 * @author Shayan Sen
 * @see Tree
 */
class Node {
    private int data;
    private Node left;
    private Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    /**
     * Sets the left child of the node.
     * @param left
     */
    void setLeft(Node left) {this.left = left;}

    /**
     * Sets the right child of the node.
     * @param right
     */
    void setRight(Node right) {this.right = right;}

    /**
     * Gets the left child of the node.
     * @return left child node
     */
    Node getLeft() {return this.left;}

    /**
     * Gets the right child of the node.
     * @return right child node
     */
    Node getRight() {return this.right;}

    /**
     * Gets the data value of the node.
     * @return integer data value
     */
    int getData() {return this.data;}
}
