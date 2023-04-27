package day3;

public class Person_constructor {
	private String name;
	private int age;
	

	public Person_constructor(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public static void main(String[] args) {
		Person_constructor obj=new Person_constructor("Radhika", 22);
		System.out.println("Name: "+obj.name+" age: "+obj.age);
		
		
		
		
	}

}
