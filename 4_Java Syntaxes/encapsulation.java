package javaLearning;

class Stack{
	//Attributes			//Encapsulation is data hiding and provide good interfaces to access them
	private int index=-1;	//we hide index and sArray attributes of a stack class
	private int[] sArray;
	
	//Constructor
	Stack(int size){
		sArray=new int[size];
	}
	
	//Methods
	public int pop() {		//but we provide necessary methods to access stack
		index-=1;
		return sArray[index+1];
	}
	public void push(int item) {
		if(index!=sArray.length-1) {
			sArray[index+1]=item;
			index+=1;
		}
		else {
			System.out.println("Stack is full!");
		}
	}
}
public class encapsulation {

	public static void main(String[] args) {
		Stack s=new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s.pop());
		s.push(6);
		s.push(7);
	}

}
