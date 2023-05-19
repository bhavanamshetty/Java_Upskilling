package day6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Example {

	public static void main(String[] args) {
		
		Set<Integer> nums=new HashSet<Integer>() ; //Set interface is implemented by HashSet class
		//for unique sorted values we have to use treeSet
		nums.add(5);
		nums.add(10);		
		nums.add(15);
		nums.add(55);
		nums.add(5);
		for(int i:nums)
		{
			System.out.println(i);
		}
		
		//we can use iterator to iterate in collections
		Iterator<Integer> values= nums.iterator();
		while(values.hasNext())
			System.out.println(values.next());
		
		
	}

}
