package day5;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class FunctInterface2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("enter");
		int num=in.nextInt();
		IntPredicate obj=n->n%2==0;
		boolean res=obj.test(num);
		System.out.println(res);
		
	}

}
