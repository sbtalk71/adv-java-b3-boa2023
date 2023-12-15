package executors.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RandomGenMain {

	public static void main(String[] args) {

		//ExecutorService es = Executors.newFixedThreadPool(2);
		
		ExecutorService es = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 5; i++) {
			es.execute(new RandomNumGenerator());
		}
		
		
		

		es.shutdown();

	}

}
