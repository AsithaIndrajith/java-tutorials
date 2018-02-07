package javaLearning;
//Exception is a problem that occurs in program execution.They arise usually for user,programming,hardware issues
//there are two type of exception
//checked and unchecked(runtime)
public class ExceptionsPartOne {

	public static void main(String[] args) {
		try {//we can use try catch in a code block
			int arrayOne[]=new int[5];//declaring an array with size 5,last index is 4
			System.out.println(arrayOne[5]);//We accessing 5th index of the array
		}catch(Exception e){//if exception arise it pass to the catch method as a parameter
			System.out.println("An error occured.");
		}

	}

}
