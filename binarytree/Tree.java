package binarytree;

/**
 * This class represents a binary tree with methods for insertion and various tree traversals.
 * It allows users to insert integer values into the tree and perform inorder, preorder, and postorder traversals.
 * 
 * Example usage:
 * Tree tree = new Tree(); // Creates a new binary tree
 * tree.insert(10); // Inserts the value 10 into the tree
 * tree.inorderT(); // Performs an inorder traversal of the tree
 * 
 * Note: This implementation assumes that the user will manage the input and output externally.
 * @author Shayan Sen
 * @see Node
 * @see Main
 */
class Tree {
    private Node root;

    /**
     * Constructor to initialize an empty binary tree.
     */
    Tree() {
        this.root = null;
    }

    /**
     * Inserts a new value into the binary tree.
     * @param value The integer value to be inserted.
     */
    void insert(int value) {
        root = insertRecursive(root, value);
    }

    /**
     * Performs an inorder traversal of the binary tree and prints the values.
     */
    void inorderT() {
        System.out.println("\nInorder Traversal:\n");
        inorderTRecursive(root);
    }

    /**
     * Performs a preorder traversal of the binary tree and prints the values.
     */
    void preorderT() {
        System.out.println("\nPreorder Traversal:\n");
        preorderTRecursive(root);
    }

    /**
     * Performs a postorder traversal of the binary tree and prints the values.
     */
    void postorderT() {
        System.out.println("\nPostorder Traversal:\n");
        posrotderTRecursive(root);
    }

    /**
     * Helper method to insert a new value into the binary tree recursively.
     * @param node current node in the tree
     * @param value value to be inserted
     * @return the updated node after insertion
     */
    private Node insertRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        } else {
            if (value < node.getData()) {
                node.setLeft(insertRecursive(node.getLeft(), value));
            }
            if (value > node.getData()) {
                node.setRight(insertRecursive(node.getRight(), value));
            }
            return node;
        }
    }

    /**
     * Helper method for inorder traversal of the binary tree.
     * @param node current node in the tree
     */
    private void inorderTRecursive(Node node) {
        if (node != null) {
            inorderTRecursive(node.getLeft());
            System.out.print(node.getData() + " ");
            inorderTRecursive(node.getRight());
        }
    }

    /**
     * Helper method for preorder traversal of the binary tree.
     * @param node current node in the tree
     */
    private void preorderTRecursive(Node node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorderTRecursive(node.getLeft());
            preorderTRecursive(node.getRight());
        }
    }

    /**
     * Helper method for postorder traversal of the binary tree.
     * @param node current node in the tree
     */
    private void posrotderTRecursive(Node node) {
        if (node != null) {
            posrotderTRecursive(node.getLeft());
            posrotderTRecursive(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }
}
