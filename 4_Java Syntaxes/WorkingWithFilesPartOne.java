package javaLearning;

import java.util.Formatter;

//creating files
//we use formatter class to create empty file
public class WorkingWithFilesPartOne {

	public static void main(String[] args) {
		try {
			Formatter f=new Formatter("E:\\JAVA\\WorkingWithFiles\\first.txt");//create empty file in the specified path
			System.out.println("file created.");
			f.format("%s", "Hello world. This the way how we creating file. "
					+ "And how the way entering data.\r\n"
					+ "We can enter as any type of data in to the file.\r\n");
			f.close();
		}catch(Exception e) {
			System.out.println("Error!");
		}
	}

}
