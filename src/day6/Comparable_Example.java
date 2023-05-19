package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//if we dont want to pass the comparator object in sort method here we can use comparable
//to use comparable we have to implement the class with comparable and use compareTo method inside class

class Students implements Comparable<Students>
{
	int age;
	String name;
	public Students(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "age=" + age + ", name=" + name ;
	}
	@Override
	public int compareTo(Students that) {
		if(this.age > that.age)
			return 1;
		else
			return -1;
	}
	
}
public class Comparable_Example {

	public static void main(String[] args) {
		List<Students> studs=new ArrayList<Students>();
		studs.add(new Students(23,"deekshitha"));
		studs.add(new Students(31,"Shantha"));
		studs.add(new Students(15,"medha"));
		studs.add(new Students(20,"dhanya"));
		
		Collections.sort(studs);
		System.out.println(studs);
		

	}

}
