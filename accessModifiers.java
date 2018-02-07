package javaLearning;

public class accessModifiers {//public classes can be access by any other classes.But default classes can only be access by classes in same pakage
	private static int age;//private,public,protected,default are access modifiers for methods and attribute.
	private static String name;//its good to have attibutes as private or protected
	
	public static void horn() {
		System.out.println("Beep!");
	}
	public static int getAge() {
		return age;
	}
	public static String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		//we cannot access age directly as System.out.println(age);
		horn();
		int x=getAge();
		System.out.println(x);
		String y=getName();
		System.out.println(y);
	}

}
