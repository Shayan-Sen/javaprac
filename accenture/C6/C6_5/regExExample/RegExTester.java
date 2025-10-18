package accenture.C6.C6_5.regExExample;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExTester {

    public static boolean validateEmail(String email) {
        String emailRegex = "^(.+)@(.+)\\.(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    public static void main(String[] args) {
        boolean repeat = true, isValid;
        int input;
        String email;
        try (Scanner scanner = new Scanner(System.in);) {
            while (repeat) {
                System.out.print("Enter 1 to try 2 to quit: ");
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.print("Enter your email: ");
                        email = scanner.next();
                        isValid = validateEmail(email);
                        if (isValid) {
                            System.out.println("Valid email");
                        } else {
                            System.out.println("Invalid email");
                        }
                        break;
                    case 2:
                        repeat = false;
                        break;
                    default:
                        System.out.println("Pls try again.....");
                        break;
                }
                System.out.println("========================================");
            }
        } catch (Exception e) {
            System.out.println("Some error occured: \n" + e.getMessage());
        }

    }
}
