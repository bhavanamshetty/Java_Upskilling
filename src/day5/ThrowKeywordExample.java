package day5;
//Write a Java program that demonstrates the use of the throw keyword to manually throw an exception.

public class ThrowKeywordExample {

    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }
}

// If the divisor is zero, we use the throw keyword to manually throw an ArithmeticException with a custom error message.
//By using the throw keyword, we can manually throw exceptions when certain conditions are not met or when specific error scenarios occur in our program.


