package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExDemo {

	public static void main(String[] args) {
		
		try {
		FileInputStream fis= new FileInputStream("demo.txt");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("See you next time..");
	}

}
