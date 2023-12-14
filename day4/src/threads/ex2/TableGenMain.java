package threads.ex2;

public class TableGenMain {

	public static void main(String[] args) throws InterruptedException{
		TableGenerator tg = new TableGenerator();
		
		Thread t1 = new Thread(new TableWorker(tg, 2));
		Thread t2 = new Thread(new TableWorker(tg, 3));
		Thread t3 = new Thread(new TableWorker(tg, 5));
		
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();

	}

}
