package day4;
enum Laptop
{
	Mackbook(100000),Lenovo(60000),Dell(80000);
	private int price;  //enum contains private variables
	private Laptop(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
}
public class EnumExample2 {
	public static void main(String [] args)
	{
		
		
		for(Laptop lap:Laptop.values())
		{
			System.out.println(lap+":"+lap.getPrice());
		}
	}

}
