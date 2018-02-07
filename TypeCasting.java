package javaLearning;
//Convert one type to another
//There are two up and down casting for classes
class Flowers{
	public void bloom(){
		System.out.println("Flower bloomed");
	}
}
class Rose extends Flowers{
	public void bloom(){
		System.out.println("Rose flower bloomed");
	}
}

public class TypeCasting {

	public static void main(String[] args) {
		//An example of type casting
		int a=(int)3.14;//this 3.14 float has been casted to integer
		System.out.println(a);
		
		//Class up casting
		Flowers f=new Rose();
		f.bloom();
		Flowers f2=new Flowers();
		((Rose)f2).bloom();
		
	}

}
