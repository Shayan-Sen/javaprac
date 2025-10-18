package accenture.C7.lesson1.functionalInterface1;

public class Main {

    private final Runnable withLambda = () -> System.out.println("From Lambda:" + this.getClass());
    private final Runnable withSubClass = new Runnable() {
        @Override
        public void run(){
            System.out.println("From SubClass:" + this.getClass());
        }
    };
    public static void main(String[] args) {
        Main main = new Main();
        BinaryOperator add = (a, b) -> a + b;
        BinaryOperator multiply = (a, b) -> a * b;
        System.out.printf("The addtion of %d and %d is %d.\nThe multiplication of %d and %d is %d.\n", 4, 3,
                add.apply(4, 3), 5, 6, multiply.apply(5, 6));
        System.out.println();
        main.withLambda.run();
        main.withSubClass.run();
    }
}
