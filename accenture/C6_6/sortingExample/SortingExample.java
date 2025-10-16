package accenture.C6_6.sortingExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("David");
        names.add("Eve");
        names.add("Charlie");

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

    }

}