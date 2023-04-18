package day1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter:");
		int a=in.nextInt();
		int b=in.nextInt();
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else if(a<b) {
			System.out.println("a is smaller than b");
		}
		else
		{
			System.out.println("a is equal to b");
		}
	}

}
