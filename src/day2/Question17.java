package day2;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of elements: ");
		int n=in.nextInt();
		System.out.println("enter the elements: ");
		int Original_arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			Original_arr[i]=in.nextInt();
		}
		int Cloned_arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			Cloned_arr[i]=Original_arr[i];
		}
		System.out.println("original array elements are: ");
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(Original_arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("clone array elements are: ");
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(Cloned_arr[i]+" ");
			}
		}
	}

}
