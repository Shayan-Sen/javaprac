package accenture.C6.C6_5.scannerExample;

import java.util.Scanner;

public class UserInputTester {

    public static void main(String[] args) {
        try(
            Scanner scanner = new Scanner(System.in);
        ){

            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();
            System.out.println("\nUser Input: " + input);

        }catch(Exception e){
            System.out.println("Some error occured: \n\n" + e.getMessage());
        }
    }
}