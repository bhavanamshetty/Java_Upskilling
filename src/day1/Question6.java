package day1;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter:");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		
	}

}
