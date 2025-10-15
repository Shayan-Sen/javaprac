package accenture.C6_2;

import java.util.Scanner;

public class Fifteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter liftoff countdown : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for(int i = 1; i <= n; i++ ){ numbers[i-1] = n-i+1; }
        String[] words = {"Ignition sequence start!","Liftoff"};
        scanner.close();
        System.out.println();
        System.out.println(words[0]);
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println(words[1]);
    }
}
