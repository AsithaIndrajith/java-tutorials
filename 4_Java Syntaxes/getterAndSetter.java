package javaLearning;

public class getterAndSetter {
	private static int age;
	private static String name;
	//Getter methods
	public static int getAge() {
		return age;
	}
	public static String getName() {
		return name;
	}
	//Setter methods
	public static void setAge(int x) {
		age=x;
	}
	public static void setName(String y) {
		name=y;
	}
	public static void main(String[] args) {
		setAge(42);
		setName("David");
		int x=getAge();
		System.out.println(x);
		String y=getName();
		System.out.println(y);
	}

}
