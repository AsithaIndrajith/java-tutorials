package MT1;

public class loopWhile {

	public static void main(String[] args) {
		int x=5;
		while(x>-1) {//loop condition-excute until condition is true
			if(x>0) {
				System.out.println(x);
				x--;
			}
			else {
				System.out.println("Blast!!!");
				x--;
			}
		}
	}

}
