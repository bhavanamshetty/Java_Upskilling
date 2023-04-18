package day1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter:");
		int a=in.nextInt();
		if(a>0)
		{
			System.out.println("positive number");
		}
		else if(a<0)
		{
			System.out.println("negative number");
		}
		else
		{
			System.out.println("number is zero");
		}
	}

}
