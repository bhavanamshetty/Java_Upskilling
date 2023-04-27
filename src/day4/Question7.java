package day4;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter i and j");
		int i=in.nextInt();
		int j=in.nextInt();
		
		try
		{
			int result=i/j;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero because it throws "+e.getMessage()+" exception");
		}
		
		
		
	}

}
