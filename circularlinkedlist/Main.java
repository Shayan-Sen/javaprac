package circularlinkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("\n\nEnter the number of elements:");
        int number = myScanner.nextInt();
        System.out.println();
        Circular circularLinkedList = new Circular();

        for(int i = 0; i < number; i++){
            System.out.print("Enter element " +(i+1)+": " );
            int data = myScanner.nextInt();
            circularLinkedList.addNode(data);
        }

        System.out.println("\n\nCircular Linked List:\n");
        circularLinkedList.displayL();
        circularLinkedList.displayR();
        myScanner.close();
    }
}
