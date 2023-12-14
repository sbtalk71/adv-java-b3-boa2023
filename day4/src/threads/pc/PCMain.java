package threads.pc;

public class PCMain {

	public static void main(String[] args) throws Exception{
		SharedData data=new SharedData();
		Thread t1 =new Thread(new Producer(data));
		Thread t2=new Thread(new Consumer(data));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

	}

}
