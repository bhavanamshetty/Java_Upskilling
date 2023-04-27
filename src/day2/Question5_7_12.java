package day2;

import java.util.Scanner;

public class Question5_7_12 {

	public static void main(String[] args) {
		int count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of elements: ");
		int n=in.nextInt();
		System.out.println("enter the elements: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		
		System.out.println("repeated element is:");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
//					count++;
//					break;
				}
				
			}
			
		}
		//System.out.println(count);
		
		
		
	}

}
