package javaLearning;
import java.util.Scanner;
public class ifElse {

	public static void main(String[] args) {
		Scanner uInput=new Scanner(System.in);
		System.out.printf("Enter your age: ");//printf-formatted print,not going to next line by default like println
		int age=uInput.nextInt();//getting user input as int
		if(age<18) {
			System.out.println("Too young.");
		}
		else if(age==18) {
			System.out.println("Welcome.");
			System.out.printf("Enter your first name: ");
			String name=uInput.next();//Read word
			if(name!="") {//nested if- if in else if
				System.out.println("Hi "+name);
			}
			else {
				System.out.println("Error");
			}
		}
		else if(age>18) {
			System.out.println("Warmly welcome..");
		}
		else {
			System.out.println("You are a hacker.");
		}

	}

}
