package day4;
class A
{
	public void show()
	{
		System.out.println("in A show..");
	}
	
	class B
	{
		public void showB()
		{
			System.out.println("in B show..");
		}
	}
}
public class InnerExample {

	public static void main(String[] args) {
		A obj=new A();
		A.B obj1=obj.new B(); // if its a static inner class then //A.B obj1=new A.B();
		obj1.showB();
		
		/* for anonymous class overriding    //same can be done for abstract class which needs another class for implementation
		  instead of having another class for abstract method implementation we can do it eactly like this
		   A obj=new A()
		   {
		     public void show()
	            {
		          System.out.println("in A show..");
	            }
	       };
	       obj.show();  //this will call this overridden show method */
		
		
	}

}
