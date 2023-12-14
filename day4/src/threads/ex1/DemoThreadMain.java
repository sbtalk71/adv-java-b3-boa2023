package threads.ex1;

public class DemoThreadMain {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+" starts");
		DemoThread t1= new DemoThread();
		DemoThread t2= new DemoThread();
		
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
