package io.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos=new FileOutputStream("data.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		for(int i=1;i<6;i++) {
		User user = new User("100"+i, "Kamal"+i, "Bangalore", "male");
		
		oos.writeObject(user);
		}
		System.out.println("Object Serialized...");
		

	}

}
