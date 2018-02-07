package javaLearning;

public class loopControl {

	public static void main(String[] args) {
		int x=5;
		System.out.println("Behaviour of break");
		while(x>0) {
			if(x==2) {
				System.out.println("break");
				break;//code goes out of the loop
			}
			System.out.println(x);
			x--;
		}
		x=5;
		System.out.println("Beahviour of continue");
		while(x>0) {
			if(x==2) {
				System.out.println("continue");
				x--;
				continue;//code jump to the next iteration of the loop
				//code writes here will not execute
			}
			System.out.println(x);
			x--;
		}
	}

}
