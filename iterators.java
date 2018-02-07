package javaLearning;

import java.util.Iterator;
import java.util.LinkedList;

//iterator is an objects that enables to cycle through a list
public class iterators {

	public static void main(String[] args) {
		LinkedList<String> animals=new LinkedList<String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		Iterator<String> it=animals.iterator();
		
		while(it.hasNext()) {//hasNext() return true if it has in the list
		System.out.println(it.next());
		}
	}


}
