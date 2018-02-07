package javaLearning;

class Machine{
	public void start() {
		System.out.println("Starting...");
	}
}

public class AnonymousClasses {

	public static void main(String[] args) {
		Machine m1=new Machine() {
			@Override public void start() {//we extend start function on the fly
				System.out.println("Wooooo...");
			}
		};
		m1.start();
		Machine m2=new Machine();
		m2.start();
	}

}
