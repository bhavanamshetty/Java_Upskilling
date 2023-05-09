package day4;

import java.util.Scanner;
@FunctionalInterface
interface Function1
{
	int count(int n);
}
public class FunctionalInterface2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter ");
		int num=in.nextInt();
		
		Function1 obj=n-> {
			int count=0;
			while(n!=0)
			{
				
				n=n/10;
				count++;
			}
			return count;
		};
		int res=obj.count(num);
		System.out.println(res);
		
	}

}
