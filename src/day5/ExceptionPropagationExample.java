package day5;
//Write a Java program that uses multiple threads to calculate the sum of an array of integers.
public class ExceptionPropagationExample {

    public static void main(String[] args) {
        try {
            performDivision(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void performDivision(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result = dividend / divisor;
        System.out.println("Division result: " + result);
    }
}

