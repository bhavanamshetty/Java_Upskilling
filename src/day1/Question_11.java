package day1;

import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter:");
		int num=in.nextInt();
		int a=0,b=0,c=1;
		int i=0;
		while(i<num)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
			i++;
		}

	}

}
