package day1;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter:");
		int num=in.nextInt();
		boolean isPrime=true;
		int i=2;
		while(i<num/2)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
			i++;
			
		}

		if(isPrime)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
