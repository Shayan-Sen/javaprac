package accenture.C6_3.workingwithobjects;

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John", "Doe");

        System.out.println("Person 1 (default constructor): " + person1);
        System.out.println("Person 2 (parameterized constructor): " + person2);

        person1.setFirstName("Jane");
        person1.setLastName("Smith");

        System.out.println("======================================================================================");
        System.out.println("Person 1 (after setting names): " + person1);
    }
}
