package day4;
interface Quadrilateral
{
	int perimeter();
	int area();
	
}
class Square implements Quadrilateral
{
	public int length;
	public Square(int length)
	{
		this.length=length;
	}
	public int perimeter()
	{
		return 4*length;
	}
	public int area()
	{
		return length*length;
	}
}
public class Question1 {

	public static void main(String[] args) {
		Quadrilateral sq=new Square(2);
		int peri=sq.perimeter();
		int area=sq.area();
		
		System.out.println("Perimeter is "+peri);
		System.out.println("Area is "+area);
		
	}

}
