package javaLearning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WorkingWithFilesPartTwo {
	public static void main(String[] args) {
		try {
			File file=new File("E:\\\\JAVA\\\\WorkingWithFiles\\\\first.txt");
			System.out.println(file.getName()+" exists.");
			Scanner sc=new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error!");
		}
	}

}
