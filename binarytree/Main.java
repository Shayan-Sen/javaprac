package binarytree;

import java.util.Scanner;

public class Main {
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
