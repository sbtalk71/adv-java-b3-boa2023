package executors.ex1;

import java.util.Random;

public class RandomNumGenerator implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				int randomNum = new Random().nextInt(20);
				System.out.println(Thread.currentThread().getName() + ":" + randomNum);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
