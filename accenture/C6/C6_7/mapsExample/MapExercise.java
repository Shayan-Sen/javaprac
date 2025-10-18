package accenture.C6.C6_7.mapsExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Person> personMap = new HashMap<String, Person>();
        try (Scanner scanner = new Scanner(System.in);) {

            System.out.print("Enter number of persons to add: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println();
            Person person;
            for (int i = 0; i < n; i++) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                System.out.println();
                try {
                    person = new Person(name, email);
                    personMap.put(person.getEmail(), person);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    i--;
                }
            }
            System.out.println("================================");
            System.out.print("Enter email to search: ");
            String searchEmail = scanner.nextLine();
            System.out.println();
            if (personMap.containsKey(searchEmail)) {
                System.out.println("Person found: " + personMap.get(searchEmail));
            } else {
                System.out.println("Person with email " + searchEmail + " not found.");
            }

            for (Map.Entry<String, Person> entry : personMap.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
