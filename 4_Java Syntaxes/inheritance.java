package javaLearning;

class Animal{
	//Attributes
	protected int legs;	//If we use private here Cat class cannot inherit such attributes
	//constructor
	Animal(){
		System.out.println("Animal");
	}
	//Methods
	public void eat() {
		System.out.println("Animal eats food");
	}
}
class Cat extends Animal{	//Cat class has inherited by animal class
	Cat(){
		legs=4;
		System.out.println("And a Cat");
	}
	public void eat() {	//Here we overrides eat method in superclass(runtime polymorphrism).
						//we cannot overrides methods declared as static or final
		super.eat();	//this is the way how we calling super class's eat method in subclass.And we cannot call super in a static feild
		System.out.println("Cat eats rats");
	}
}
public class inheritance {

	public static void main(String[] args) {
		System.out.println("<Animal obj>");
		Animal x=new Animal();
		x.eat();
		System.out.println("<Cat obj>");
		Cat tom=new Cat();
		tom.eat();
	}

}
