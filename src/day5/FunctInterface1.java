package day5;

import java.util.Scanner;

interface Function
{
	int print(int n);
}
public class FunctInterface1 {
// square of a number
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("enter");
		int num=in.nextInt();
		Function obj= n -> n*n;
		int res=obj.print(num);
		System.out.println(res);
			
		
	}

}
