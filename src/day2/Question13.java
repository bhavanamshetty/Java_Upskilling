package day2;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of elements: ");
		int n=in.nextInt();
		System.out.println("enter the elements: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
