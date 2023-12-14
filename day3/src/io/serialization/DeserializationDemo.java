package io.serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("data.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {

				Object obj = ois.readObject();

				User user = (User) obj;

				System.out.println(user);
			}
		} catch (EOFException e) {
			//e.printStackTrace();
			System.out.println("Objects Deserialized..");
		} finally {
			ois.close();
		}
	}

}
