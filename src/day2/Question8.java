package day2;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		//factorial
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=in.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
			
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+n+" is "+fact);
	}

}
