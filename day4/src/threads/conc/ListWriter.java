package threads.conc;

import java.util.List;
import java.util.Map;

public class ListWriter implements Runnable {

	private List<String> listData;

	public ListWriter(List<String> listData) {
		this.listData = listData;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		try {

			for (int i = 0; i < 100; i++) {
				listData.add(threadName + i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
