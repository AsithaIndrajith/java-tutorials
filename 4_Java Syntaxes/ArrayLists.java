package javaLearning;
//ArrayLists are unlike java arrays.We can shrink or expand it size when it's items are removing or adding
import java.util.ArrayList;

public class ArrayLists {//use arrayLists when you need rapid access to data

	public static void main(String[] args) {
		//we can create ArrayLists without type or size-> ArrayList colors=new ArrayList();
		ArrayList<String>colors=new ArrayList<String>(10);//this code create arraylist with type String and 
															//size 10
															//Note:-we cannot use type like int.we use Integer
		colors.add("Red");//add elements to arraylist
		colors.add("Orange");
		colors.add("Blue");
		colors.remove("Red");//remove elements from arraylist
		System.out.println(colors);
		System.out.println(colors.contains("Red"));//.contains method check that element is in the list and return boolean value
		System.out.println(colors.get(1));//return the element at given index
		System.out.println(colors.size());//return the size
		colors.clear();//clear all elements
		System.out.println(colors);
	}

}
