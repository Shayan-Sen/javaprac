package stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("STACK OPERATIONS:\n\n");
        System.out.println("Press 1 to Push an element into the stack\n");
        System.out.println("Press 2 to Pop an element from stack\n");
        System.out.println("Press 3 to view top element\n");
        System.out.println("Press 4 for whole stack \n");
        System.out.println("Press 5 to clear the stack\n");
        System.out.println("Press 6 to exit\n");
        System.out.println("================================================================================");
        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    stack.addItem(element);
                    break;
                case 2:
                    stack.removeItem();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.printStack();
                    break;
                case 5:
                    stack.clearStack();
                    break;
                case 6:
                    System.out.println("Exiting....");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}