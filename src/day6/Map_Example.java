package day6;

import java.util.HashMap;
import java.util.Map;

public class Map_Example {

	public static void main(String[] args) {
		Map<String, Integer> students=new HashMap<>();
		//here also sequence is not followed, if we need an order we have to use TreeMap
		
		students.put("Navin",56); //here we dont have add() method, instead we have put() method
		students.put("Satish",66);
		students.put("Kavya",89);
		students.put("Vandhana",91);
		
		System.out.println(students); //to print all values
		System.out.println(students.get("Kavya")); // .get() -> to print the value of a given key
		
		System.out.println(students.keySet()); //prints only the keys
		//to print all values we have students.values() method 
		for(String key: students.keySet())
		{
			System.out.println(key+ ":"+ students.get(key));
		}
	}

}
