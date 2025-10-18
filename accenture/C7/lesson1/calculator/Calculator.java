package accenture.C7.lesson1.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<String,ShayanBinaryOperator> operations = new HashMap<String,ShayanBinaryOperator>();

    public void registerOperations(String a,ShayanBinaryOperator b){
        operations.put(a.strip(), b);
    }
    public double calculate(double a,String b,double c) throws Exception{
        if (operations.get(b) == null) {
            throw new Exception("Operation unavailable");
        }
        return operations.get(b).apply(a, c);
    }
}
