package javaLearning;

enum WeekDays{
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday,
	Saturday,
	Sunday
}

public class enums {

	public static void main(String[] args) {
		WeekDays day1=WeekDays.Monday;
		switch(day1) {
		case Monday:
			System.out.println("Hi Monday");
			break;
		default:
			System.out.println("Not Monday");
		}
		
	}

}
