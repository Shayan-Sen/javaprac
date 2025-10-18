package accenture.C6.C6_2;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){ System.out.print(" "); }
            for(int k = 0; k < 2*i +1; k++){  System.out.print("*"); }
            System.out.println();
        }
        System.out.println();
    }
}
