package day5;
//Write a Java program that defines a custom exception class and throws it in a method.

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    public static void main(String[] args) {
        try {
            validateNumber(101);
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validateNumber(int number) throws CustomException {
        if (number > 100) {
            throw new CustomException("Number exceeds the limit");
        } else {
            System.out.println("Number is valid");
        }
    }
}

