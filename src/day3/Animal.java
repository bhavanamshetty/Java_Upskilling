package day3;
class Dog extends Animal
{
	public void speak()
	{
		System.out.println("Woof!");
	}
}

public class Animal {
	public void speak()
	{
		System.out.println("Animal class");
	}

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.speak();
		
	}

}
