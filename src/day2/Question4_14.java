package day2;

import java.util.Scanner;

public class Question4_14 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of elements: ");
		int n=in.nextInt();
		
		int arr[]=new int[n];
		System.out.println("enter the elements: ");
		for(int i=0;i<n;i++) 
		{
			arr[i]=in.nextInt();
		}
		
		int max=arr[0], min=arr[0];
		for(int i=0;i<n;i++) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		
	}

}
