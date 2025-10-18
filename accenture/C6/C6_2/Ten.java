package accenture.C6.C6_2;

import java.util.Scanner;

public class Ten {

    public static int product(int a,int b){return a*b;}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers for multiplication::\n\nEnter the first number : ");
        int first  =  scanner.nextInt();
        System.out.print("Enter the second number : ");
        int second = scanner.nextInt();
        int prod = product(first, second);
        scanner.close();
        System.out.printf("\nThe Product of the numbers %d and %d is %d\n",first,second,prod);
        System.out.println();
    }
}
