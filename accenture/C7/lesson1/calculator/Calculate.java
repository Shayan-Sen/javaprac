package accenture.C7.lesson1.calculator;

public class Calculate {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Calculate [int] [operator] [int]");
            return;
        }
        Calculator calculator = new Calculator();

        calculator.registerOperations("+", (a,b)->a+b);
        calculator.registerOperations("-", (a,b)->a-b);
        calculator.registerOperations("x", (a,b)->a*b);
        calculator.registerOperations("*", (a,b)->a*b);
        calculator.registerOperations("/", (a,b)->a/b);

        int a = Integer.parseInt(args[0]);
        String operator = args[1];
        int b = Integer.parseInt(args[2]);
        try{System.out.println(calculator.calculate(a, operator, b));
        }catch(Exception e){System.out.println("Error occured: " + e.getMessage());}
    }
}
