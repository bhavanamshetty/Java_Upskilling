package day4;
class Animal
{
	public void sound()
	{
		System.out.println("All animals make a sound");
	}
}
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Dog barks");
	}
	public void bite()
	{
		System.out.println("Dog bites");
	}
}
public class Question2_downcasting {

	public static void main(String[] args) {
		Animal animal=new Dog();
		animal.sound();
		if (animal instanceof Dog)
		{
		Dog dog=(Dog)animal;//where animal is an object of parent class
		dog.bite();
		}
		
		
	}

}
