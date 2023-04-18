package day1;

import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter:");
		String str=in.nextLine();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}

}
