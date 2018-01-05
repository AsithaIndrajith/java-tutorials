package MT1;

public class incrementOrDecrement {
	public static void main(String args[]) {
		int a=6,b=0;
		System.out.println("Original a,b: "+a+","+b);
		System.out.println("With prefix ++a: "+(++a));
		a=6;
		System.out.println("With postfix a++: "+(a++));
		a=6;
		b=++a;
		System.out.println("Assign a to b with pretfix a: "+a);
		System.out.println("Assign a to b with pretfix b: "+b);
		a=6;
		b=0;
		b=a++;
		System.out.println("Assign a to b with postfix a: "+a);
		System.out.println("Assign a to b with postfix b: "+b);
	}

}
