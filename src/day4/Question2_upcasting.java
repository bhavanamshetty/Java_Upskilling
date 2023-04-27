package day4;
class Animals
{
	public void sound()
	{
		System.out.println("All animals make a sound");
	}
}
class Dog1 extends Animals
{
	public void sound()
	{
		System.out.println("Dog barks");
	}
}
public class Question2_upcasting {

	public static void main(String[] args) {
		Animals animal=new Dog1();
		animal.sound();
		
	}

}
