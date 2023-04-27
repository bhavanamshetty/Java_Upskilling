package day2;

public class Two_D_Array {

	public static void main(String[] args) {
		int nums[][]=new int[3][4];    //for jagged arrays with different columns,we define it separately
		                               // nums[][]=new int[3][];  bcoz all are of diff sizes
		                               // nums[0]=new int[3];
		                               // nums[1]=new int[4];
		                               // nums[2]=new int[2];                       
		
		
		
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				nums[i][j]=(int)(Math.random()*10); //to print random numbers
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
//		for(int i[]:nums)      //2D array using forEach loop or enhanced for loop
//		{
//			for(int j:i)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
	}

}
