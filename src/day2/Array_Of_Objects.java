package day2;
class Student
{
	String name;
	int marks;
}

public class Array_Of_Objects {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Mohan";
		s1.marks=81;
		
		Student s2=new Student();
		s2.name="Nayana";
		s2.marks=92;
		
		Student s3=new Student();
		s3.name="mayin";
		s3.marks=75;
		
		Student students[]=new Student[3]; //array of students 
		//here we are creating an array which can hold student references
		//it cant create object//we have to manually create objects(as we are doing below) and assign it to this array
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].name+":"+students[i].marks);
		}
		
//		for(Student stud:students)
//		{
//			System.out.println(stud.name+":"+stud.marks);
//		}
		
	}

}
