package javaLearning;

import java.util.ArrayList;
import java.util.Collections;//Collections class has different methods to process elements in lists

public class sortingLists {

	public static void main(String[] args) {
		ArrayList<String>animals=new ArrayList<String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Bat");
		animals.add("Rat");
		System.out.println(animals);
		
		System.out.println("Sort collection");
		Collections.sort(animals);//use collection class to get sort method//Collection class is static so we dont need to create objects
		System.out.println(animals);
		
		System.out.println("Minimum");
		System.out.println(Collections.min(animals));
		
		System.out.println("Maximum");
		System.out.println(Collections.max(animals));

		System.out.println("Reverse collection");
		Collections.reverse(animals);
		System.out.println(animals);
		
		System.out.println("Shuffle Collection");
		Collections.shuffle(animals);
		System.out.println(animals);
	}

}
