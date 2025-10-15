package accenture.C6_3.creatingclass;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bulldog", "Bruno", "Brown", 3);
        Dog dog2 = new Dog("Beagle", "Bella", "White and Brown", 2);

        System.out.println(dog1.description());
        System.out.println(dog2.description());

        dog1.incrementAge();
        System.out.println("After a year, " + dog1.getDogName() + " is now " + dog1.getDogAge() + " years old.");

        System.out.println(dog1);
        System.out.println(dog2);
    }
}
