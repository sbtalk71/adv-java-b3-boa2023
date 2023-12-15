package executors.ex2;

public class TableGenerator {

	public synchronized void printTable(int num) {
		try {
			for(int i=1;i<11;i++) {
				System.out.println(Thread.currentThread().getName()+": ["+ num+"X"+i+" = "+(num*i)+"]");
				Thread.sleep(500);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
