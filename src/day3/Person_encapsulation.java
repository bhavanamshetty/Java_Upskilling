package day3;

public class Person_encapsulation {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Person_encapsulation obj=new Person_encapsulation();
		obj.setName("Radhika");
		obj.setAge(22);
		
		System.out.println("Name: "+obj.getName()+"\nage: "+obj.getAge());

	}

}
