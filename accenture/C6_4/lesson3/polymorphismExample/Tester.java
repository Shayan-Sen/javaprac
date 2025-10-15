package accenture.C6_4.lesson3.polymorphismExample;

public class Tester {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Boat();
        vehicles[2] = new Plane();
        for (Vehicle v : vehicles) {
            v.start();
            v.speed();
            v.direction();
            v.stop();
            System.out.println("-----");
        }
    }
}