package doublylinkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dll list = new Dll();
        Scanner myobj = new Scanner(System.in);
        System.out.print("\n\nEnter the number of elements:");
        int number = myobj.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print("\nEnter element " + (i + 1) + ":");
            int element = myobj.nextInt();
            list.add(element);
        }

        System.out.println("\n\nThe Linked List:");
        list.displayF();
        list.displayB();
        myobj.close();
    }
}
