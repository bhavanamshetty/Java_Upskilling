package day4;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
	{
		super(str);
	}
}
public class CustomException {
	
	static void validateAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter");
		int age=in.nextInt();
		try
		{
			validateAge(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		
	

}
}