package javaLearning;

class Dog{//creating dog class 
	void bark() {//and create method bark
		System.out.println("Woof..Woof..");
	}
}

public class createClassAndObject {
	public static void main(String[] args) {
		Dog dog=new Dog();//creating new dog object
		dog.bark();//accessing the created method
	}
}