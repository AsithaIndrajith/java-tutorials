package javaLearning;

public class method {
	static void sayHello() {//when we declare method or attributes as static it belongs to that class
		System.out.println("Hello!");
	}
	public static void main(String[] args) {
		method.sayHello();//we can access it usning as this or below
		sayHello();
	}

}
