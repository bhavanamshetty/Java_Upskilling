package day1;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter:");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		//QUESTION 8
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}

		}
	}

}
