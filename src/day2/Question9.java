package day2;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		//fibonacci series
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=in.nextInt();
		int a=0,b=0,c=1;
		System.out.println("Fibonacci series of "+n+" numbers :");
		for(int i=0;i<n;i++) 
		{
			a=b;
			b=c;
			c=a+b;
		    System.out.println(a);	
			
		}
		
	}

}
