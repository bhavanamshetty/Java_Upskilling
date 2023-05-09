package day2;

import java.util.Scanner;

public class Question10_armstrong {

	public static void main(String[] args) {
		//armstrong number= sum of all individual number cubes should be equal to the number itself
				//153 = (1)3 + (5)3 + (3)3=153
				Scanner in=new Scanner(System.in);
				System.out.println("enter  number: ");
				int num=in.nextInt();
//				System.out.println("enter second number: ");
//				int num2=in.nextInt();
				
				
				//close all these codes below in a for loop to print armstrong numbers from 1 to 500
				//for(int i=num1;i<num2;i++){
					int check,rem,sum=0;
					check=num;
					while(check!=0)
					{
						rem=check%10;
						sum=sum+(rem*rem*rem);
						check=check/10;
					}
					if(sum==num)   //num will be equal to i if we want to print from a r
					{
						System.out.println("armstrong numbers are: "+num);
					}
					else
					{
						System.out.println("not an armstrong number");
					}
					
		
	}

}
