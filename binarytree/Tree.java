package binarytree;

class Tree {
    private Node root;

    Tree() {
        this.root = null;
    }

    void insert(int value) {
        root = insertRecursive(root, value);
    }

    void inorderT() {
        System.out.println("\nInorder Traversal:\n");
        inorderTRecursive(root);
    }

    void preorderT() {
        System.out.println("\nPreorder Traversal:\n");
        preorderTRecursive(root);
    }

    void postorderT() {
        System.out.println("\nPostorder Traversal:\n");
        posrotderTRecursive(root);
    }

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

    private void inorderTRecursive(Node node) {
        if (node != null) {
            inorderTRecursive(node.getLeft());
            System.out.print(node.getData() + " ");
            inorderTRecursive(node.getRight());
        }
    }

    private void preorderTRecursive(Node node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorderTRecursive(node.getLeft());
            preorderTRecursive(node.getRight());
        }
    }

    private void posrotderTRecursive(Node node) {
        if (node != null) {
            posrotderTRecursive(node.getLeft());
            posrotderTRecursive(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }
}
