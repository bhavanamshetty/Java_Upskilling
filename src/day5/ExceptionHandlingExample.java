package day5;
//Write a Java program that uses a try-catch block to handle an exception and print an error message to the console.

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        try {
            return dividend / divisor;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}

