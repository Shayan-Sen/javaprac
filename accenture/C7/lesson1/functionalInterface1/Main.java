package accenture.C7.lesson1.functionalInterface1;

public class Main {
    public static void main(String[] args) {
        BinaryOperator add = (a, b) -> a + b;
        BinaryOperator multiply = (a, b) -> a * b;
        System.out.printf("The addtion of %d and %d is %d.\nThe multiplication of %d and %d is %d.\n", 4, 3,
                add.apply(4, 3), 5, 6, multiply.apply(5, 6));
    }
}
