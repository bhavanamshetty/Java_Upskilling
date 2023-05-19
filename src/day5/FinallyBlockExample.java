package day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//Write a Java program that uses the finally block to clean up resources after an exception has been thrown.

public class FinallyBlockExample {

    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("sample.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            // Clean up resources in the finally block
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }
    }
}