package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Write a Java program to read user input using BufferedReader.
public class Q1 {
	public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.err.println("Error reading user input: " + e.getMessage());
        }
    }


}
