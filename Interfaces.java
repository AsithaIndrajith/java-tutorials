package javaLearning;
//Interfaces is a completely abstract class and contains only abstract methods
//Defined using interface keyword.May contain only static final variables.Cannot contain a constructor.Because they
//cannot be instantiated.But interfaces can extends.
interface Vehicles{//contain only abstract methods.This is implicitly abstract
	public void go();
	public void makeSound();
}

class BMW implements Vehicles{
	public void go() {
		System.out.println("Let's Go.");
	}
	public void makeSound() {
		System.out.println("Broom..Broom..");
	}
}
public class Interfaces {

	public static void main(String[] args) {
		BMW b1=new BMW();
		b1.go();
		b1.makeSound();
	}

}
