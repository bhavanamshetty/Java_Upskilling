package day1;

import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter:");
		int n=in.nextInt();
		int sum=0;
		
		int i=1;
		do
		{
			sum=sum+i;
			i++;
			
		}while(i<=n);
		System.out.println(sum);
	}

}
