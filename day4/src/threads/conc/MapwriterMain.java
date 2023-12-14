package threads.conc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapwriterMain {

	public static void main(String[] args) throws InterruptedException{
		//HashMap<String, String> dataMap=new HashMap<String, String>();
		//ConcurrentHashMap<String, String> dataMap=new ConcurrentHashMap<String, String>();
		
		Map<String, String> dataMap=Collections.synchronizedMap(new HashMap<String, String>());
		
		Thread t1= new Thread(new MapWriter(dataMap));
		Thread t2=new Thread(new MapWriter(dataMap));
		Thread t3=new Thread(new MapWriter(dataMap));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Total entries in the map : "+dataMap.size());

	}

}
