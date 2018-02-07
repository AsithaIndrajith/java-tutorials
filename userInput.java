package javaLearning;
import java.util.Scanner;
public class userInput {
	public static void main(String[] args) {
		Scanner uInput=new Scanner(System.in);
		System.out.println("Read complete Line:-nextLine(): "+uInput.nextLine());
		System.out.println("Read word:-next(): "+uInput.next());
		System.out.println("Read Int:-nextInt(): "+uInput.nextInt());
		System.out.println("Read Double:-nextDouble(): "+uInput.nextDouble());
	}
}
