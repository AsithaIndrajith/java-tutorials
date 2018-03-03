package javaLearning;

class A{
	A(int i){
		System.out.println(i+" in Constructor A");
	}
}

class B extends A{
	B(int i){
		/*when we initialising object from class B it calls its parent
		class(Note:even class A calls it's parent class and it is object class)
		but parent A need parameter i for its constructor.So to come over with
		this we use super(); function and pass parameter for it.
		then it calls B's super class and pass 2 to it*/
		super(2);
		System.out.println(i+" in Constructor B");
	}
}
class C extends B{
	C(){
		super(3);
		System.out.println("Constructor C");
	}
}

public class Super {

	public static void main(String[] args) {
		C b =new C(); 
	}

}
