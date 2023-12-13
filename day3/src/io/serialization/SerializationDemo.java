package io.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos=new FileOutputStream("data.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		User user = new User("100", "Kamal", "Bangalore", "male");
		
		oos.writeObject(user);
		System.out.println("Object Serialized...");
		

	}

}
