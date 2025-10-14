package accenture.C6_2;

import java.util.Scanner;

public class Nine {

    int addNumbers(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Nine obj = new Nine();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers for addition::\n\nEnter the first number : ");
        int first  =  scanner.nextInt();
        System.out.print("Enter the second number : ");
        int second = scanner.nextInt();
        int sum = obj.addNumbers(first, second);
        scanner.close();
        System.out.printf("\nThe Sum of the numbers %d and %d is %d\n",first,second,sum);
    }
}
