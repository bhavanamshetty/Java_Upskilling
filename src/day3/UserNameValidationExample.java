package day3;

import java.util.Scanner;

public class UserNameValidationExample {

    public static void main(String[] args) {
        try {
            String name = getValidNameFromUser();
            System.out.println("Valid name: " + name);
        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String getValidNameFromUser() throws InvalidNameException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            throw new InvalidNameException("Name cannot be empty");
        }

        if (!name.matches("[a-zA-Z]+")) 
        //name.matches("[a-zA-Z]+") checks if the name string consists of one or more alphabetic characters. If the name contains any non-alphabetic characters, the condition
        {
            throw new InvalidNameException("Name can only contain alphabetic characters");
        }

        return name;
    }

    public static class InvalidNameException extends Exception {
        public InvalidNameException(String message) {
            super(message);
        }
    }
}

