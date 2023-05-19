package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList_Strings_Example {

	public static void main(String[] args) {
		List<String> myList=new ArrayList<String> ();
		myList.add("bhavana");
		myList.add("sahana");
		myList.add("sushmitha");
		myList.add("pavan");
		Comparator<String> com=new Comparator<String>()
				{
			//sorting based on length of the name
			public int compare(String i,String j)
			{
				if(i.length()>j.length())
					return 1;
				else
					return -1;
				
			}
				};
				
			Collections.sort(myList,com);
			System.out.println(myList);
	}

}
