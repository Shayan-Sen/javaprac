package accenture.C6_7.queuesExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {
    public static void main(String[] args) {
        Queue<String> customers = new LinkedList<String>();
        customers.add("1234");
        customers.add("3412");
        customers.add("0123");
        customers.add("4321");
        while (!customers.isEmpty()) {
            System.out.println("Customer " + customers.poll() + " is being served.");
        }
    }
}
