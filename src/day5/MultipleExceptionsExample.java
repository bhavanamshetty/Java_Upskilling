package day5;

//Write a Java program that defines a method that throws multiple exceptions, and use the throws keyword to declare them in the method signature.

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptionsExample {

    public static void main(String[] args) {
        try {
            processInput("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Input/output error: " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("Error parsing input: " + e.getMessage());
        }
    }

    public static void processInput(String fileName) throws FileNotFoundException, IOException, ParseException {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("Invalid file name");
        }

        // Simulating a FileNotFoundException
        if (!fileName.equals("input.txt")) {
            throw new FileNotFoundException("File not found");
        }

        // Simulating an IOException
        throw new IOException("Input/output error");

        // Simulating a ParseException
        // throw new ParseException("Error parsing input", 0);

        // Processing logic...
    }
}

