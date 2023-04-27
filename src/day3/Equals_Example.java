package day3;
class Laptop
{
	String model;
	int price;
	//toString method with user implementation for more readable output
	public String toString()
	{
		return model +":"+ price;
	}
	
	//equals method to compare the values assigned to objects
	public boolean equals(Laptop lp)
	{
		if(this.model.equals(lp.model) && (this.price == lp.price))
		{
			return true;
		}
		else
			return false;
	}
	
	
}
public class Equals_Example {

	public static void main(String[] args) {
		Laptop obj1=new Laptop();
		obj1.model="Dell";
		obj1.price=50000;
		
		Laptop obj2=new Laptop();
		obj2.model="Dell";
		obj2.price=50000;
		
		boolean result=obj1.equals(obj2);
		System.out.println(result);
		
		
		
	}

}
