package accenture.C6.C6_7.setsExample;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setExercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,1, 2, 3,3,3, 4, 5, 6, 7, 8, 9,9,9, 10);
        Set<Integer> set = new HashSet<Integer>(numbers);
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (Integer s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
