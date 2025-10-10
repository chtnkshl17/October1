package Sep27;

import org.w3c.dom.ls.LSOutput;

public class CalculatorMain {

    public static void main(String[] args) {


        Calculator calculator = new Calculator();

        double sum = calculator.sum(10.5, 20);
        System.out.println("Sum of numbers : " + sum);

        double sub = calculator.sub(20.8, 10.3);
        System.out.println("Subtraction of numbers : " + sub);

        double mul = calculator.mul(34.23,37.25);
        System.out.println("Multiplication of numbers : " + mul);

        double div = calculator.div(5.89,10.11);
        System.out.println("Division of the numbers : " + div);


    }
}
