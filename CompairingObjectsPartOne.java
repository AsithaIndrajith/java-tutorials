package javaLearning;

class Ball{
	String type;
	Ball(String t){
		type=t;
	}
}

public class CompairingObjectsPartOne {

	public static void main(String[] args) {
		Ball b1=new Ball("FootBall");
		Ball b2=new Ball("FootBall");
		System.out.println(b1==b2);//This return false because nor two objects are same
	}

}
