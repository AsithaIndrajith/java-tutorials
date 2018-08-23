package javaLearning;
class Vehicle{
	private String colour;
	private int vehicleAge;
	
	Vehicle(String c){
		this.setColour(c);
	}
	
	//setter
	public void setColour(String color) {//we cannot use static in outside here
		colour=color;
	}
	public void setAge(int a) {//we cannot use static here
		vehicleAge=a;
	}
	//getter
	public String getColour() {
		return colour;
	}
	public int getAge() {
		return vehicleAge;
	}
	
}
public class constructors {
	public static void main(String[] args) {
		Vehicle car=new Vehicle("Red");
		car.setAge(20);
		String x=car.getColour();
		System.out.println(x);
		int y=calYear(car);
		System.out.println(y);
		
	}
	public static int calYear(Vehicle v) {
		return 2018-v.getAge();
	}

}
