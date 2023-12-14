package threads.ex1;

public class RunnableMain {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+" starts");
		
 Thread t1= new Thread(new Worker());
 Thread t2= new Thread(new Worker());
		
		t1.start();
		t2.start();
		
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getState());
		
		
		t1.setPriority(7);
		//t1.setName("thread1");
		
		t1.join();
		
		t2.join();
		System.out.println(Thread.currentThread().getName()+" exits");
		
		
		

	}

}
