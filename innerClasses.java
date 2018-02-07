package javaLearning;

class Robot{
	int id;
	Robot(int i){
		id=i;
		Brain b=new Brain();
		b.think();
	}
	//Inner class
	private class Brain{//This class can access all members of its class.And it cannot be access by outside any object
		public void think() {
			System.out.println(id+" is thinking...");
		}
	}
}

public class innerClasses {

	public static void main(String[] args) {
		Robot r1=new Robot(345);
	}

}
