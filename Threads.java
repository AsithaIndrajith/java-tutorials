package javaLearning;
//We can run two or more component concurruntly using java thread
//One way to create thread class is to extend the thread class
class Loader extends Thread{//extends thread class and override run method
	public void run() {
		System.out.println("Hello");//we can set the priority of the thread using setPriority method
	}
}

public class Threads {
	public static void main(String[] args) {
		Loader obj=new Loader();
		obj.start();//when we call start run method run on a different thread
	}

}

//Other way to create a thread is to implements a runnable interface(best way)
/*
class Loader implements Runnable{
	public void run() {
		System.out.println("Hello");
	}
}

public class Threads {
	public static void main(String[] args) {
		Thread t=new Thread(new Loader());
		t.start();
	}

}

*/
//we can use Thread.sleep(1000); method to delay the thread.But we need to handle InterruptedException using
//throws or try catch block