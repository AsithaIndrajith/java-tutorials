package javaLearning;

public class logicalOperators {
	public static void main(String[] args) {
		int age=23;
		double salary=2500;
		if(age>18 && salary>3000) {// &&-and operator-works when both true
			System.out.println("You are Welcome.");
		}
		else if(age>18||salary>3000) {// ||-or operator-works when one true
			System.out.println("Bad Luck.");
		}
		else if(!(age>18)) {//!-not operator-convert to opposite
			System.out.println("Too young.");
		}
		else {
			System.out.println("Try again.");
		}
	}

}
