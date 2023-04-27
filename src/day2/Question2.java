package day2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter row number: ");
		int row=in.nextInt();
		System.out.println("enter column number: ");
		int col=in.nextInt();
		
		System.out.println("enter first elements: ");
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		
		System.out.println("enter second elements: ");
		int b[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[i][j]=in.nextInt();
			}
		}
		
		System.out.println("Matrix addition ");
		int sum[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i[]:sum)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

}
