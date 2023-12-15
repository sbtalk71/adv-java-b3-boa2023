package executors.ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorWithSync {

	public static void main(String[] args) throws Exception{
		ExecutorService es= Executors.newCachedThreadPool();
		
		TableGenerator tg= new TableGenerator();
		
									
				es.execute(new TableWorker(tg,2));
				es.execute(new TableWorker(tg,5));
				es.execute(new TableWorker(tg,7));
				
				Thread.sleep(30000);
				
				es.execute(new TableWorker(tg,2)); //threads are reused
				es.execute(new TableWorker(tg,5));
				es.execute(new TableWorker(tg,7));
				
			es.shutdown();	
		

	}

}
