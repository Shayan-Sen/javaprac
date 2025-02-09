package stack;

import java.util.ArrayList;
import java.util.List;

class Stack {
    private List<Integer> stack = new ArrayList<>();

    void addItem(Integer item) {
        stack.add(item);
        System.out.println("\nElement " + item + " successfully added to stack\n");
    }

    void removeItem() {
        if (!stack.isEmpty()) {
            System.out.println(
                    "\nElement " + stack.get(stack.size() - 1) + " at index " + (stack.size() - 1) + " removed\n");
            stack.remove(stack.size() - 1);
        } else {
            System.out.println("\nStack is empty\n");
        }

    }

    void printStack() {
        System.out.println("\nStack:");
        if (!stack.isEmpty()) {
            for (Integer item : stack) {
                System.out.print(item + " ");
            }
            System.out.println("<== top\n");
        } else {
            System.out.println("\nStack is empty\n");
        }
    }

    void peek() {
        if (!stack.isEmpty()) {
            System.out.println("\nTop element of stack is: " + stack.get(stack.size() - 1));
            System.out.println();
        } else {
            System.out.println("\nStack is empty\n");
        }
    }

    void clearStack() {
        stack.clear();
        System.out.println("\nStack is now empty\n");
    }
}