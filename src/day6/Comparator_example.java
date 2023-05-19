package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "age=" + age + ", name=" + name ;
	}
	
}
public class Comparator_example {

	public static void main(String[] args) {
		List<Student> studs=new ArrayList<Student>();
		studs.add(new Student(23,"deekshitha"));
		studs.add(new Student(31,"Shantha"));
		studs.add(new Student(15,"medha"));
		studs.add(new Student(20,"dhanya"));
		
		Comparator<Student> com=new Comparator<Student>()  //we can use lambda exp here as comparator ia a functional inteface
		//	Comparator<Student> com=(i,j) -> i.age>j.age ? 1:-1;
				
				{
			public int compare(Student i,Student j)
			{
				if(i.age > j.age)
					return 1;
				else
					return -1;
				
				//we can use ternary operator here
				//return i.age>j.age ? 1:-1;
			}
			
				};
			Collections.sort(studs,com); //if we dont want to pass the comparator object here we can use comparable
			System.out.println(studs);
		
	}

}
