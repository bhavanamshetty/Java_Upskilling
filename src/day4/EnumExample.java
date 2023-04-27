package day4;
enum Status
{
	Running,Failed,Pending,Success;
}
public class EnumExample {

	public static void main(String[] args) {
		Status s= Status.Pending;
		
		switch(s)
		{
		case Running:
		{
			System.out.println("All good");
			break;
		}
		case Failed:
		{
			System.out.println("Try again");
			break;
		}
		case Pending:
		{
			System.out.println("Please wait");
			break;
		}
		default:
		{
			System.out.println("Done");
			break;
		}
		}
		
	}

}
