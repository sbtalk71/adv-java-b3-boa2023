package threads.ex1;

public class DemoThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" starts");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() +":"+ i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" exits");
	}
	
}
