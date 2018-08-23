package javaLearning;
import java.util.HashMap;
//Hash map lists store elements as key,value pairs
public class HashMaps {

	public static void main(String[] args) {
		HashMap<String,Integer>points=new HashMap<String,Integer>();
		points.put("Amy", 154);//we use put method to add
		points.put("Dave", 42);
		points.put("Rob", 733);
		points.put("Jhon", 93);
		System.out.println(points);
		points.remove("Amy");//remove Amy with its value
		System.out.println(points);
		System.out.println(points.get("Dave"));//get value of Dave
		System.out.println(points.containsKey("Peter"));//check that key Amy in the hash map
		System.out.println(points.containsValue(733));//check that value 733 in the hash map
	}
}
