package javaLearning;

class Balls{
	String type;
	Balls(String t){
		type=t;
	}
	//we generate hashcode and equals functions.Source->Generate hashcode and equals
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balls other = (Balls) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}

public class CompairingObjectsPartTwo {

	public static void main(String[] args) {
		Balls b1=new Balls("FootBall");
		Balls b2=new Balls("FootBall");
		System.out.println(b1.equals(b2));
	}

}
