package day2;

import java.util.Scanner;

public class Question10_magic {

	public static void main(String[] args) {
//A Magic number is a number whose sum of its digits are calculated till a single digit obtained is 1
		//19=1 + 9 = 10       ---->1 + 0 = 1
		Scanner in = new Scanner(System.in);
		System.out.println("enter number: ");
		int n = in.nextInt();
		int num = n;
		int sum = 0, r ;
		while (num > 9) {

			while (num > 0)

			{
				r = num % 10;
				sum = sum + r;
				num = num / 10;

			}
			num = sum;
			sum=0;
		}
		if (num == 1) {
			System.out.println("This is a magic number");
		} else {
			System.out.println("This is not a magic number");
		}

	}

}
