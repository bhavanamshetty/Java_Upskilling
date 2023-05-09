package day4;

import java.util.Scanner;
@FunctionalInterface
interface Function
 {
	 int add(int i,int j);
 }
public class FunctionalInterface1 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter a and b");
		int a=in.nextInt();
		int b=in.nextInt();
		
		Function fi=(i,j) -> i+j;
		int res=fi.add(a, b);
		System.out.println(res);
	
	}

}
