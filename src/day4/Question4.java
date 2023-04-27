package day4;
enum Calculator
{
	Addition,Subtraction,Multiplication,Division;
}
public class Question4 {

	public static void main(String[] args) {
		Calculator calc=Calculator.Multiplication;
		switch(calc)
		{
		case Addition:
		{
			System.out.println("Add two numbers");
			break;
		}
		case Subtraction:
		{
			System.out.println("Subtract two numbers");
			break;
		}
		case Multiplication:
		{
			System.out.println("multiply two numbers");
			break;
		}
		case Division:
		{
			System.out.println("divide two numbers");
			break;
		}
		}
		
	}

}
