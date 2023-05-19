package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Write a Java program that demonstrates the use of try-with-resources to automatically close resources.
public class Q3 {
	
	//By using try-with-resources, we don't need to explicitly close the Scanner. 
	//The try block will automatically close the scanner resource at the end.
	public static void main(String[] args) {
		 try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
	            System.out.print("Enter your name: ");
	            String name = reader.readLine();
	            System.out.println("Hello, " + name + "!");
	        } catch (IOException e) {
	            System.err.println("Error reading user input: " + e.getMessage());
	        }
	}
//        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.print("Enter your name: ");
//            String name = scanner.nextLine();
//            System.out.println("Hello, " + name + "!");
//        }
        
        
        

}
