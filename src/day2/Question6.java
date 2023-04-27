package day2;

import java.util.Scanner;

public class Question6 {

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
		
		//System.out.println("repeated element is:");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
				
			}
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
