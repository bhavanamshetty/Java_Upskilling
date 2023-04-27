package day2;
class OverLoad
{
	public void add(int i,int j)
	{
		int result=i+j;
		System.out.println(result);
	}
	public void add(int i,int j,int k)
	{
		int result=i+j+k;
		System.out.println(result);
	}
	public void add(double i,double j)
	{
		double result=i+j;
		System.out.println(result);
	}
}
public class Question1_overloading {
	

	public static void main(String[] args) {
		OverLoad ol=new OverLoad();
		ol.add(4,5);
		ol.add(4, 5,2);
		ol.add(4.2, 5.8);
		
	}

}
