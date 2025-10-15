package accenture.C6_4.lesson3.inheritenceExample;

public class Tester {
    public static void main(String[] args) {
        Person sally = new Person("Sally","Philips");
        System.out.println(sally);
        System.out.println("=========================================================");
        Student mike = new Student("Mike", "Thompson", "12345");
        System.out.println(mike);
        System.out.println("=========================================================");
        StudentEmployee jeff = new StudentEmployee("Jeff","Sam","4567","#12345",200.50);
        System.out.println(jeff);

    }
}
