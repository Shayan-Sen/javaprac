package binarytree;

import java.util.Scanner;
/**
 * This is a simple implementation of a binary tree with insertion and traversal methods.
 * It allows users to insert elements into the tree and perform inorder, preorder, and postorder traversals.
 * 
 * The main method prompts the user to input the number of elements they wish to insert into the binary tree,
 * followed by the elements themselves. After all elements are inserted, it displays the results of the three
 * different tree traversals.
 * 
 * Example usage:
 * 1. Compile and run the program.
 * 2. Input the number of elements you want to insert into the binary tree.
 * 3. Input each element one by one.
 * 4. The program will output the inorder, preorder, and postorder traversals of the binary tree.
 * 
 * Note: This implementation assumes that the user inputs valid integers for the tree elements.
 * @author Shayan Sen
 * @see Tree
 * @see Scanner
 * @see Node
 */
public class Main {

        /**
        * Main method to execute the binary tree operations.
        * @param args Command line arguments (not used).
        */
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("\nEnter the number of elements in binary tree:");
        int number = myScanner.nextInt();
        Tree binarytree = new Tree();

        for (int i = 0; i < number; i++) {
            System.out.print("Insert element " + (i + 1) + " into tree:");
            int value = myScanner.nextInt();
            binarytree.insert(value);
            System.out.println();
        }
        System.out.println();
        binarytree.inorderT();
        System.out.println();
        binarytree.preorderT();
        System.out.println();
        binarytree.postorderT();
        System.out.println();
        myScanner.close();
    }
}
