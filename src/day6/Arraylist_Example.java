package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraylist_Example {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<Integer>(); //list is an inteface which is implemented by ArrayList class
		nums.add(19); //.add() -> to add elements to list
		nums.add(11);
		nums.add(33);
		nums.add(22);
		
		int index=nums.get(2); //.get() -> to fetch the number at that index position
		nums.indexOf(15); // .indexOf() -> to get index of the value we give
		
		System.out.println(index);
		
		for(int i:nums)  // to display or print all the values in the list
		{
			System.out.println(i);
		}
		
		//we have a separate Collections.sort() method to sort the elements
//		Collections.sort(nums);
//		System.out.println(nums);
		
		//to sort according to our own logic we need to use comparator
		Comparator<Integer> com=new Comparator<Integer>()  //since Comparator is an interface to create an object we have to use an anonymous class
				{
			public int compare(Integer i,Integer j)
			{ //to sort using just last number
				if(i%10 > j%10) //%10 to check the last digit
					return 1; //swap
				else
					return -1;
			}
				};
				Collections.sort(nums,com); //pass that comparator object here to implement our own logic
				System.out.println(nums);
		//to implement our own logic we need to use compare method
		//syntax: int compare(type1 obj,type2 obj)
		
	}

}
