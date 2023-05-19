package day5;

//Write a Java program that reads input from the user and validates it using exception handling. If the input is not valid, the program should throw an exception with a custom error message.

import java.util.Scanner;

public class InputValidationExample_Age {

    public static void main(String[] args) {
        try {
            int age = getValidAgeFromUser();
            System.out.println("Valid age: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int getValidAgeFromUser() throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            throw new InvalidAgeException("Age must be a positive number");
        }

        return age;
    }

    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
}
