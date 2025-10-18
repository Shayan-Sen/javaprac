package accenture.C6.C6_5.exceptionExample;

public class Tester {
    public static void main(String[] args) {
        String[] numbers = {"1234567890", null, "0987654321", "5678901234","2345678901"};
        for (String number : numbers) {
            try {
                Phone phone = new Phone("iPhone", number);
                System.out.println(phone);
            } catch (IllegalArgumentException e) {
                System.out.println("Error creating phone: " + e.getLocalizedMessage());
            }
        }
    }
}
