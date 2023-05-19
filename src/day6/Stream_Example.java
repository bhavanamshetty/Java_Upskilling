package day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Example {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(4,5,6,7); //Arrays.asList is used to add elements to list directly instead of using .add() every single time
		                                    //Arrays is a class
		//nums.forEach(n-> System.out.println(n));  //forEach method to print all values
	//stream()  = we can do any operations on list using streams without affecting the original elements in nums
		//Stream<Integer> s1=nums.stream();
		//s1.forEach(n-> System.out.println(n));  //but streams can be used only once, can be operated only once
		//using streams the advantage is it has many methods using which we can perform some fuctions
		//.filter() is used to get only those values which we want, .map() is used to perform any operation etc
		
		//take only even numbers, double it and add
		int result= nums.stream()
				.filter(n->n%2==0)
				.map(n->n*2)
				.reduce(0,(c,e) -> c+e); //reduce will give just one value, c means carry, e means element
		System.out.println(result);
}
	
	//for sorting
//	Stream<Integer> sortedValues=nums.stream()
//	.filter(n->n%2==0)
//	.sorted();
//	
//	sortedValues.forEach(n-> System.out.println(n));
}
