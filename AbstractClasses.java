package javaLearning;
//Abstract class is with only essential information only.If there is a method type abstract class also should
//be abstract.And we cannot instantiate abstract classes.So we need to inherit classes from it.
abstract class Animals{
	//Atribs
	protected int legs=4;
	//Methods
	abstract void makeSound();//Method has not implemented.
}

class Cats extends Animals{
	public void makeSound() {//in inherited class we should need to implement unimplemented methods for use
		System.out.println("Meow...");
	}
}
public class AbstractClasses {

	public static void main(String[] args) {
		Cats tom=new Cats();
		tom.makeSound();
	}

}
