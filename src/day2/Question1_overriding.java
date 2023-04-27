package day2;
class Parent
{
	public void features()
	{
		System.out.println("genes");
	}
}
class Child extends Parent
{
	public void features()
	{
		System.out.println("genes inherited");
	}
}
public class Question1_overriding {

	public static void main(String[] args) {
		Parent child=new Child();
		child.features();
	}

}
