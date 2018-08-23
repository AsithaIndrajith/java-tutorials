package javaLearning;

public class arrayStructure {

	public static void main(String[] args) {
		
		int[] intArray=new int[5];//create a array with size 5
		intArray[0]=12;//initialising array positions with values
		intArray[1]=23;
		intArray[2]=7;
		
		//Accessing array using for loop
		System.out.println("Using normal for loop:");
		System.out.printf("[");
		for(int i=0;i<5;i++) {
			if(i!=4) {
				System.out.printf(intArray[i]+",");
			}
			else {
				System.out.printf(intArray[i]+"");
			}
		}
		System.out.println("]");
		
		System.out.println("Using enhanced for loop:");
		for(int i:intArray) {
			System.out.println(i);
		}
		
		//if we knows values in array we can use array leteral
		String[] stringArray= {"A","B","C","D"};
		//without using normal for loop we can use enhanced for loop for access array elements
		System.out.println("Acessing string array using enhanced for loop");
		for(String s:stringArray) {
			System.out.println(s);
		}
	}

}
