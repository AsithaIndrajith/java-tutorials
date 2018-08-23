package javaLearning;

import java.util.LinkedList;//import linked list
//linked list are as same as array lists
public class LinkedLists {

	public static void main(String[] args) {
		LinkedList<String>colours=new LinkedList<String>();//as in array lists we cannot give size for this
		colours.add("Red");//add elements to linked list
		colours.add("Orange");
		colours.add("Blue");
		colours.add("Purple");
		colours.add("Green");
		colours.add("Yellow");
		colours.add("Indigo");
		colours.remove("Red");//remove elements from linked list
		System.out.println(colours);
	}

}
