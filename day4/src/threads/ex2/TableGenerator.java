package threads.ex2;

public class TableGenerator {

	public synchronized void printTable(int num) {
		try {
			for(int i=1;i<11;i++) {
				System.out.println(num+"X"+i+" = "+(num*i));
				Thread.sleep(2000);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
