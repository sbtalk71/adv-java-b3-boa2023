package threads.conc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class ListWriterMain {

	public static void main(String[] args) throws InterruptedException{
		
		//List<String> listData=new ArrayList<String>();
		
		List<String> listData=new Vector<String>();
		
		Thread t1= new Thread(new ListWriter(listData));
		Thread t2=new Thread(new ListWriter(listData));
		Thread t3=new Thread(new ListWriter(listData));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Total entries in the map : "+listData.size());

	}

}
