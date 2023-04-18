package day1;

public class Question2 {

	public static void main(String[] args) {
		
		//int to string
		int n=22;
		String str1=String.valueOf(n);
		System.out.println(str1);
		
		//string to int
		String str2="32";
		int num2=Integer.parseInt(str2);
		System.out.println(num2);
		
		//double to int
		double d=5.46;
		int a=(int) d;
		System.out.println(a);
		
		//string to double
		String str3="42";
		double d2=Double.parseDouble(str3);
		System.out.println(d2);
	}

}
