package javaLearning;

public class switchStatement {

	public static void main(String[] args) {
		int age=18;
		//switch statement with break
		System.out.println("Age is: "+age);
		System.out.println("switch statement with break");
		switch (age) {//put the variable which need to check
			case 5:
				System.out.println("Hey kid.");
				break;
			case 16:
				System.out.println("Hey teen.");
				break;
			case 18:
				System.out.println("Hey young.");
				break;
			case 25:
				System.out.println("Hey man.");
				break;
			default:
				System.out.println("Hey old man.");
				break;
		}
		//switch statement with break-it go to matching case and excute code until switch ends
		System.out.println("switch statement with out break");
		switch (age) {
			case 5:
				System.out.println("Hey kid.");
			case 16:
				System.out.println("Hey teen.");
			case 18:
				System.out.println("Hey young.");
			case 25:
				System.out.println("Hey man.");
			default:
				System.out.println("Hey old man.");
	}
	

}
}
